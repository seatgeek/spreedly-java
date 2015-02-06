package cc.protea.util.http;

import com.squareup.okhttp.Headers;
import com.squareup.okhttp.MediaType;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.RequestBody;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static com.squareup.okhttp.Request.Builder;

public class OkHttpSpreedlyClient implements HttpClient {
    @Override
    public Response execute(Request spreedlyRequest) throws IOException {
        final OkHttpClient client = new OkHttpClient();
        final Builder okBuilder = new Builder().url(spreedlyRequest.getUrl());
        final Map<String, List<String>> headers = spreedlyRequest.getHeaders();
        final RequestBody requestBody = RequestBody.create(MediaType.parse(spreedlyRequest.getContentType()), spreedlyRequest.getBody());

        if (!headers.isEmpty()) {
            for (Map.Entry<String, List<String>> entry : headers.entrySet()) {
                List<String> values = entry.getValue();

                for (String value : values) {
                    okBuilder.addHeader(entry.getKey(), value);
                }
            }
        }

        okBuilder.method(spreedlyRequest.getMethod(), requestBody);

        final com.squareup.okhttp.Request request = okBuilder.build();

        com.squareup.okhttp.Response response = client.newCall(request).execute();

        return fromOkResponse(response);
    }

    private Response fromOkResponse(com.squareup.okhttp.Response response) {
        final Response outResponse = new Response();
        final Headers okHeaders = response.headers();
        final Set<String> names = okHeaders.names();
        final HashMap<String, List<String>> headers = new HashMap<String, List<String>>(names.size());

        outResponse.setResponseCode(response.code());
        outResponse.setResponseMessage(response.message());

        for (String name : names) {
            headers.put(name, okHeaders.values(name));
        }

        outResponse.setHeaders(headers);

        try {
            outResponse.setBody(response.body().string());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return outResponse;
    }
}
