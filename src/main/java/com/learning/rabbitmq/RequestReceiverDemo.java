package com.learning.rabbitmq;

import com.learning.rabbitmq.requestresponse.RequestReceiver;

public class RequestReceiverDemo {

    public static void main(String[] args) {
        final RequestReceiver receiver = new RequestReceiver();
        receiver.initialize();
        receiver.receive();
        receiver.destroy();
    }
}
