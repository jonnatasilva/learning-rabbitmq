package com.learning.rabbitmq;

import com.learning.rabbitmq.Sender;

public class FanoutExchangeSenderDemo {

    public static final String FANOUT_EXCHANGE_TYPE = "fanout";

    public static void sendToFanoutExchange(String exchange) {
        Sender sender = new Sender();
        sender.intialize();
        sender.send(exchange, FANOUT_EXCHANGE_TYPE, "Test message");
        sender.destroy();
    }

    public static void main(String[] args) {
        sendToFanoutExchange("pubsub_exchange");
    }
}
