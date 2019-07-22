package com.company.server;

public class Request {
    private MethodHttp methodHttp;
    private String methodString;

    public Request(MethodHttp methodHttp, String methodString) {
        this.methodHttp = methodHttp;
        this.methodString = methodString;
    }

    public MethodHttp getMethodHttp() {
        return methodHttp;
    }

    public void setMethodHttp(MethodHttp methodHttp) {
        this.methodHttp = methodHttp;
    }

    public String getMethodString() {
        return methodString;
    }

    public void setMethodString(String methodString) {
        this.methodString = methodString;
    }
}
