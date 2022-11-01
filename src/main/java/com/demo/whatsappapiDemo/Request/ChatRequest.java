package com.demo.whatsappapiDemo.Request;

public class ChatRequest {
    private String toNumber;
    private String message;

    public String getToNumber() {
        return toNumber;
    }

    public void setToNumber(String toNumber) {
        this.toNumber = toNumber;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
