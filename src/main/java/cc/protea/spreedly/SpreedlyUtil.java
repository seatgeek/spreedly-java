package cc.protea.spreedly;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

import java.io.IOException;
import java.io.StringWriter;

import cc.protea.util.http.HttpClient;
import cc.protea.util.http.Request;
import cc.protea.util.http.Response;
import cc.protea.util.xml.XmlUtils;

class SpreedlyUtil {

    private final String          environmentKey;
    private final String          apiSecret;
    private final HttpClient      client;
    private final Base64Converter base64Converter;
    private       Logger          logger;

    public SpreedlyUtil(final String environmentKey, final String apiSecret, final HttpClient client, final Base64Converter base64Converter, Logger logger) {
        this.environmentKey = environmentKey;
        this.apiSecret = apiSecret;
        this.client = client;
        this.base64Converter = base64Converter;
        this.logger = logger;
    }

    <T> T options(final String url, final Class<T> type) throws SpreedlyException, IOException {
        Response response = getService(url).optionsResource(client);
        return convert(response.getBody(), type);
    }

    <T> T get(final String url, final Class<T> type) throws SpreedlyException, IOException {
        Response response = getService(url).getResource(client);
        return convert(response.getBody(), type);
    }

    <T> T delete(final String url, final Object bodyObject, final Class<T> type) throws SpreedlyException, IOException {
        String body = convert(bodyObject);
        Response response = getService(url).setBody(body).deleteResource(client);
        return convert(response.getBody(), type);
    }

    void delete(final String url, final Object bodyObject) throws SpreedlyException, IOException {
        String body = convert(bodyObject);
        getService(url).setBody(body).deleteResource(client);
    }

    <T> T put(final String url, final Object bodyObject, final Class<T> type) throws SpreedlyException, IOException {
        String body = convert(bodyObject);
        Response response = getService(url).setBody(body).putResource(client);
        return convert(response.getBody(), type);
    }

    <T> T post(final String url, final Object bodyObject, final Class<T> type) throws SpreedlyException, IOException {
        String body = convert(bodyObject);
        Response response = getService(url).setBody(body).postResource(client);
        return convert(response.getBody(), type);
    }

    private String getAuthorizationHeader() {
        final String pair = this.environmentKey + ":" + this.apiSecret;
        final String base64 = base64Converter.encode(pair);

        return "Basic " + base64;
    }

    private Request getService(final String url) {
        final Request request = new Request(url).setContentType("application/xml")
                                                .addHeader("Accept", "application/xml")
                                                .setLogger(logger);

        if (apiSecret == null) {
            request.addQueryParameter("environment_key", this.environmentKey);
        } else {
            request.addHeader("Authorization", getAuthorizationHeader());
        }

        return request;
    }

    private <T> T convert(final String xml, final Class<T> type) throws SpreedlyException {
        if (xml == null) {
            return null;
        }

        if (String.class.equals(type)) {
            //noinspection unchecked
            return (T) xml;
        }

        try {
            return XmlUtils.parse(type, xml);
        } catch (Exception e) {
            if (logger != null) {
                logger.log("Failed to parse XML as " + type.toString());
                logException(logger, e);
            }

            if (xml.contains("<errors>")) {
                SpreedlyErrors errors = convert(xml, SpreedlyErrors.class);
                throw new SpreedlyException(e, errors.error.key, errors.error.error);
            }

            if (xml.contains("<hash>")) {
                SpreedlyHash hash = convert(xml, SpreedlyHash.class);
                throw new SpreedlyException(e, hash.status, hash.error);
            }

            throw new SpreedlyException(e);
        }
    }

    @Root(name = "hash", strict = false)
    private static class SpreedlyHash {
        public String status;
        public String error;
    }

    @Root(name = "errors", strict = false)
    private static class SpreedlyErrors {
        @Element
        SpreedlyError error;
    }

    private static class SpreedlyError {
        @Element
        public String error;
        @Attribute(name = "key")
        public String key;
    }

    private String convert(final Object object) throws IOException {
        try {
            if (object == null) {
                return "";
            }

            StringWriter writer = new StringWriter();

            XmlUtils.write(object, writer);

            return writer.toString();
        } catch (Exception e) {
            // Persister.write throws generic Exception
            throw new IOException(e);
        }
    }

    private void logException(Logger logger, Exception e) {
        logger.log(" - " + e.toString());

        for (StackTraceElement stackTraceElement : e.getStackTrace()) {
            logger.log("  - " + stackTraceElement.toString());
        }
    }

}
