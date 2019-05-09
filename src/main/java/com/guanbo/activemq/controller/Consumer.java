package com.guanbo.activemq.controller;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {

    @JmsListener(destination = "test.queue")
    public void reciveQueue(String test){
        System.out.println("ConsumerOne收到的消息"+test);
    }
}
