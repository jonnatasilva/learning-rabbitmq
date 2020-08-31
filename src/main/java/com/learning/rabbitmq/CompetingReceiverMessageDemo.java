package com.learning.rabbitmq;

import com.learning.rabbitmq.pointtopoint.CompetingReceiver;

public class CompetingReceiverMessageDemo {

    public static void main(String[] args) throws InterruptedException {
        final CompetingReceiver receiver1 = new CompetingReceiver();
        receiver1.initialize();

        final CompetingReceiver receiver2 = new CompetingReceiver();
        receiver2.initialize();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                receiver1.receive();
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                receiver2.receive();
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();
        receiver1.destroy();
        receiver2.destroy();
    }
}
