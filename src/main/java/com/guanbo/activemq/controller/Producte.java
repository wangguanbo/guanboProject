package com.guanbo.activemq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Service;

import javax.jms.Destination;

@Service(value = "producer")
public class Producte {

    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;

    public void sendMessages(Destination destination , final String message){
        jmsMessagingTemplate.convertAndSend(destination,message);

    }

}
