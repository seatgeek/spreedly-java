package cc.protea.util.http;

import java.io.IOException;

public interface HttpClient {
    public Response execute(Request request) throws IOException;
}
