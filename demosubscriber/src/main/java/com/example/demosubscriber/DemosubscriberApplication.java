package com.example.demosubscriber;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.integration.channel.DirectChannel;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;

@SpringBootApplication
@EnableBinding(MyConsumer.class)
@Slf4j
public class DemosubscriberApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemosubscriberApplication.class, args);
	}

	@StreamListener(MyConsumer.INPUT)
	public void listenerMethod(Message<String> message)
	{
		log.debug("Message received {}", message);
	}
}
