package com.learning.rabbitmq;

public class TopicSenderDemo {

    public static void sendToTopicExchange() {
        Sender sender = new Sender();
        sender.intialize();
        sender.sendEvent( "Teste Message 1", "seminar.java");
        sender.sendEvent( "Teste Message 2", "seminar.rabbitmq");
        sender.sendEvent("Teste Message 2", "hackaton.rabbitmq");
        sender.destroy();
    }

    public static void main(String[] args) {
        sendToTopicExchange();
    }
}
