package com.company.server;

public class RequestProcessing extends Thread {

    private Request request;
    private static final int NUMB_OF_REQUESTS = 10;

    public RequestProcessing(Request request) {
        this.request = request;
    }

    @Override
    public void run() {
        System.out.println("In this server arrived request " + request.getMethodHttp() + " with name <" + request.getMethodString() + ">");
        System.out.println("Request <" + request.getMethodString() + "> with method " + request.getMethodHttp() + " was processed");
    }
}
