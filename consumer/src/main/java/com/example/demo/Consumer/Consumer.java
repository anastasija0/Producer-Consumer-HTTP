package com.example.demo.Consumer;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Consumer {
    //both the controller and message consumer!

    @PostMapping("/receive")
    // maps to the /receive endpoint, so it listens for POST requests and processes the message sent by the producer
    public String receiveMessage(@RequestBody String message) {
        //The message is received in the body of the POST request and logged!!
        System.out.println("Message received: " + message);
        return "Message received: " + message; // Confirms that the message has been processed.
    }
}
