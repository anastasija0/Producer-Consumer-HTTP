package com.example.demo.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class Producer {

    @Autowired

//    private JmsTemplate jmsTemplate;
//
//    private final String queue = "test-queue";
//
//    public void sendMessage(String message) {
//        jmsTemplate.convertAndSend(queue, message);
//        System.out.println("Message sent to the queue: " + message);
//    }
    private RestTemplate restTemplate;
    //RestTemplate allows producer to make HTTP requests!!

    private final String consumerUrl = "http://localhost:8081/receive"; // Consumer's endpoint

    public void sendMessage(String message) {
        restTemplate.postForObject(consumerUrl, message, String.class);
        System.out.println("Message sent to consumer: " + message);
    }
}

