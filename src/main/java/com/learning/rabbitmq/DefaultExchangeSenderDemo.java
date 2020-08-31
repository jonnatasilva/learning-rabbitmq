package com.learning.rabbitmq;

public class DefaultExchangeSenderDemo {

    public static  void sendToDefaultExchange() {
        Sender sender = new Sender();
        sender.intialize();
        sender.send("Test message");
        sender.destroy();
    }

    public static void main(String[] args) {
        sendToDefaultExchange();
    }
}
