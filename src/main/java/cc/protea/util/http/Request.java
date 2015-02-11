package cc.protea.util.http;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import cc.protea.spreedly.Logger;

/*
 * Copyright 2012 Joe J. Ernst
 * <p/>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p/>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p/>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * This class represents an HTTP Request message.
 */
public class Request extends Message<Request> {

    public static final String PARAM_ENCODING = "UTF-8";
    public static final String METHOD_DELETE  = "DELETE";
    public static final String METHOD_POST    = "POST";
    public static final String METHOD_OPTIONS = "OPTIONS";
    public static final String METHOD_PUT     = "PUT";
    public static final String METHOD_GET     = "GET";

    String url;

    Map<String, String> query = new HashMap<String, String>();

    private boolean doOutput;

    private String contentType;

    private Logger logger;

    /**
     * The Constructor takes the url as a String.
     *
     * @param url The url parameter does not need the query string parameters if
     *            they are going to be supplied via calls to {@link #addEncodedQueryParameter(String, String)}.  You can, however, supply
     *            the query parameters in the URL if you wish.
     * @throws IOException
     */
    public Request(final String url) {
        this.url = url;
    }

    /**
     * Adds a Query Parameter to a list.  The list is converted to a String and appended to the URL when the Request
     * is submitted.
     *
     * @param name  The Query Parameter's name
     * @param value The Query Parameter's value
     * @return this Request, to support chained method calls
     */
    public Request addEncodedQueryParameter(final String name, final String value) {
        this.query.put(name, value);
        return this;
    }

    /**
     * Adds an already-encoded Query Parameter to a list.  The list is converted to a String and appended to the URL when the Request
     * is submitted.
     *
     * @param name  The encoded Query Parameter's name
     * @param value The encoded Query Parameter's value
     * @return this Request, to support chained method calls
     */
    public Request addQueryParameter(final String name, final String value) {
        try {
            this.query.put(URLEncoder.encode(name, PARAM_ENCODING), URLEncoder.encode(value, PARAM_ENCODING));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }

        return this;
    }

    /**
     * Removes the specified Query Parameter.
     *
     * @param name The name of the Query Parameter to remove
     * @return this Request, to support chained method calls
     */
    public Request removeQueryParameter(final String name) {
        this.query.remove(name);
        return this;
    }

    /**
     * Sets the URL that this Request will be sent to.
     *
     * @param url The url parameter does not need the query string parameters if
     *            they are going to be supplied via calls to {@link #addEncodedQueryParameter(String, String)}.  You can, however, supply
     *            the query parameters in the URL if you wish.
     * @return this Request, to support chained method calls
     * @throws MalformedURLException If the supplied url is malformed.
     */
//    public Request setUrl(String url) throws MalformedURLException {
//        this.url = new URL(url);
//        return this;
//    }

    /**
     * Issues a GET to the server.
     *
     * @return The {@link Response} from the server
     * @throws IOException
     */
    public Response getResource(HttpClient client) throws IOException {
        buildQueryString();

        setDoOutput(true);
        setMethod(METHOD_GET);

        return execute(client);
    }

    /**
     * Issues an OPTIONS to the server.
     *
     * @param client {@link HttpClient} to execute on
     * @return
     * @throws IOException
     */
    public Response optionsResource(HttpClient client) throws IOException {
        buildQueryString();

        setDoOutput(true);
        setMethod(METHOD_OPTIONS);

        return execute(client);
    }

    /**
     * Issues a PUT to the server.
     *
     * @param client {@link HttpClient} to execute on
     * @return The {@link Response} from the server
     * @throws IOException
     */
    public Response putResource(HttpClient client) throws IOException {
        buildQueryString();

        setDoOutput(true);
        setMethod(METHOD_PUT);

        return execute(client);
    }

    /**
     * Issues a POST to the server.
     *
     * @param client {@link HttpClient} to execute on
     * @return The {@link Response} from the server
     * @throws IOException
     */
    public Response postResource(HttpClient client) throws IOException {
        buildQueryString();

        setDoOutput(true);
        setMethod(METHOD_POST);

        return execute(client);
    }

    private Response execute(HttpClient client) throws IOException {
        if (logger != null) {
            logger.log("Request: " + url);

            logHeaders(logger, headers);

            if (METHOD_POST.equals(getMethod())) {
                logger.log("Body: " + getBody());
            }
        }

        final Response response = client.execute(this);

        if (logger != null) {
            logger.log(String.format("Response: %d %s", response.getResponseCode(), url));

            logHeaders(logger, response.headers);

            logger.log("Body: " + response.getBody());
        }

        return response;
    }

    private void logHeaders(Logger localLogger, Map<String, List<String>> localHeaders) {
        for (String key : localHeaders.keySet()) {
            for (String value : localHeaders.get(key)) {
                localLogger.log(" - " + key + ": " + value);
            }
        }
    }

    /**
     * Issues a DELETE to the server.
     *
     * @param client {@link HttpClient} to execute on
     * @param client
     * @return The {@link Response} from the server
     * @throws IOException
     */
    public Response deleteResource(HttpClient client) throws IOException {
        buildQueryString();

        setDoOutput(true);
        setMethod(METHOD_DELETE);

        return execute(client);
    }

    /**
     * A private method that loops through the query parameter Map, building a String to be appended to the URL.
     *
     * @throws MalformedURLException
     */
    private void buildQueryString() throws MalformedURLException {
        StringBuilder builder = new StringBuilder();

        // Put the query parameters on the URL before issuing the request
        if (!query.isEmpty()) {
            for (Map.Entry<String, String> param : query.entrySet()) {
                builder.append(param.getKey());
                builder.append("=");
                builder.append(param.getValue());
                builder.append("&");
            }

            builder.deleteCharAt(builder.lastIndexOf("&")); // Remove the trailing ampersand
        }

        if (builder.length() > 0) {
            // If there was any query string at all, begin it with the question mark
            builder.insert(0, "?");
        }

        url = url.toString() + builder.toString();
    }

    public String getUrl() {
        return this.url;
    }

    public boolean getDoOuput() {
        return this.doOutput;
    }

    public Map<String, List<String>> getHeaders() {
        return this.headers;
    }

    private Request setDoOutput(boolean doOutput) {
        this.doOutput = doOutput;
        return this;
    }

    public Request setContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }

    public String getContentType() {
        return this.contentType;
    }

    public Request setLogger(Logger logger) {
        this.logger = logger;
        return this;
    }
}