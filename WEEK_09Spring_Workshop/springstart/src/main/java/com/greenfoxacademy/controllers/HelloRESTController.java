package com.greenfoxacademy.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by Viktor on 2016.12.19..
 */
@RestController
public class HelloRESTController {

    AtomicLong counter=new AtomicLong();

    @RequestMapping(value = "/greeting")
    @ResponseBody
   public Greeting greeting( @RequestParam(name = "name") String s){
        counter.incrementAndGet();
        Greeting greetingObject=new Greeting(counter, s);
        return  greetingObject;

   // public ResponseEntity<Greeting> greeting() {
       // return new ResponseEntity<Greeting>(greetingObject, HttpStatus.OK);

    }
}