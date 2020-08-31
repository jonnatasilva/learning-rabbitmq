package com.learning.rabbitmq;

public class RequestSenderDemo {

    private static final String REQUEST_QUEUE = "request_queue";

    public static String sendToRequestReplyQueue() {
        Sender sender = new Sender();
        sender.intialize();
        sender.sendRequest( "Test message.", "MSG1");
        String result = sender.waitForResponse("MSG1");
        sender.destroy();
        return result;
    }

    public static void main(String[] args) {
        sendToRequestReplyQueue();
    }
}
