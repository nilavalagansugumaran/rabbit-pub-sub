package com.example.demopublisher.service;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface MySource {
    /**
     * @return output channel
     */
    @Output("nilaOutput")
    MessageChannel output();

}
