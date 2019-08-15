package com.example.demopublisher.controller;

import com.example.demopublisher.service.MyPublisher;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test-api")
@Slf4j
@Component
public class MyController {

    @Autowired private MyPublisher myPublisher;
    /**
     * Checks if the movie ID and given preference are valid.
     *
     * @return
     */
    @PostMapping(value = "/publish-message", produces = {MediaType.TEXT_PLAIN_VALUE})
    public ResponseEntity checkParentalControl(@RequestBody String message) {

            log.debug("request message received {}", message);
            myPublisher.publishMessage(message);
            return new ResponseEntity("success", HttpStatus.OK);
    }

}
