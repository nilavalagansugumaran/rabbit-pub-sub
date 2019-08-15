package com.example.demopublisher.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;

@Component
@EnableBinding(MySource.class)
@Slf4j
public class MyPublisher {

    @Autowired
    @Qualifier("nilaOutput")
    private MessageChannel output;

    public void publishMessage(String messageString){

        log.debug("publishing  message {}" , messageString);
        Message<String> message =
                MessageBuilder.withPayload(messageString).build();
        output.send(message);
    }
}
