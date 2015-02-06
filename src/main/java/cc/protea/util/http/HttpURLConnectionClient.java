package cc.protea.util.http;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;

import cc.protea.util.StreamUtil;

public class HttpURLConnectionClient implements HttpClient {

    @Override
    public Response execute(Request request) throws IOException {
        HttpURLConnection connection = (HttpURLConnection) new URL(request.getUrl()).openConnection();

        connection.setDoOutput(request.getDoOuput());
        connection.setRequestMethod(request.getMethod());

        final Map<String, List<String>> headers = request.getHeaders();

        if (!headers.isEmpty()) {
            for (Map.Entry<String, List<String>> entry : headers.entrySet()) {
                List<String> values = entry.getValue();

                for (String value : values) {
                    connection.addRequestProperty(entry.getKey(), value);
                }
            }
        }

        OutputStreamWriter writer = new OutputStreamWriter(connection.getOutputStream());
        writer.write(request.getBody());
        writer.close();

        return readResponse(connection);
    }

    /**
     * A private method that handles reading the Responses from the server.
     *
     * @return a {@link Response} from the server.
     * @throws IOException
     * @param connection
     */
    private Response readResponse(HttpURLConnection connection) throws IOException {
        final Response response = new Response();

        response.setResponseCode(connection.getResponseCode());
        response.setResponseMessage(connection.getResponseMessage());
        response.setHeaders(connection.getHeaderFields());

        try {
            response.setBody(StreamUtil.getStringFromStream(connection.getInputStream()));
        } catch (IOException e) {
            response.setBody(StreamUtil.getStringFromStream(connection.getErrorStream()));
        }

        return response;
    }
}
