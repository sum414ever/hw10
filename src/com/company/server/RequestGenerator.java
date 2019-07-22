package com.company.server;

public class RequestGenerator {

    Server server = new Server();
    private static final int NUMB_OF_METHODS = 10;

    public void generateRequest() {

        for (int i = 0; i < NUMB_OF_METHODS; i++) {
            server.processRequest(new Request(MethodHttp.GET, "Request number " + i));
            server.processRequest(new Request(MethodHttp.POST, "Request number " + i));
            server.processRequest(new Request(MethodHttp.PUT, "Request number " + i));
            server.processRequest(new Request(MethodHttp.DELETE, "Request number " + i));
        }
    }
}
