package com.guanbo.activemq;

import com.guanbo.activemq.controller.Producte;
import org.apache.activemq.command.ActiveMQQueue;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.jms.Destination;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ActiveMqTest {

    @Autowired
    private Producte producte;

    @Test
    public void contentTest(){
        Destination destination = new ActiveMQQueue("test.queue");
        producte.sendMessages(destination,"11111111111");
    }

}

