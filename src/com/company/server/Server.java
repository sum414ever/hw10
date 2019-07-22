package com.company.server;

public class Server {

    public void processRequest(Request request) {
        RequestProcessing requestProcessing = new RequestProcessing(request);
        requestProcessing.start();
    }
}
