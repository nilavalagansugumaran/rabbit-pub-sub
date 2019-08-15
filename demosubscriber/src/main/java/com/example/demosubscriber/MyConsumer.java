package com.example.demosubscriber;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface MyConsumer {

    /**
     * Input channel name.
     */
    String INPUT = "nilaInput";

    /**
     * @return input channel.
     */
    @Input(MyConsumer.INPUT)
    SubscribableChannel input();

}
