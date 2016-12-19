package com.greenfoxacademy.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Viktor on 2016.12.19..
 */
@RestController
public class HelloRESTController {
    Greeting greetingObject=new Greeting();

    @RequestMapping(value = "/greeting")
    public ResponseEntity<Greeting> greeting() {
        return new ResponseEntity<Greeting>(greetingObject, HttpStatus.OK);

    }

}