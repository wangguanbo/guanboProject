package com.guanbo.activemq.controller;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class ConsumerTwo {

    @JmsListener(destination = "test.queue")
    public void receiveQueue(String text){
        System.out.println("ConsumerTwo接收到消息"+text);
    }
}
