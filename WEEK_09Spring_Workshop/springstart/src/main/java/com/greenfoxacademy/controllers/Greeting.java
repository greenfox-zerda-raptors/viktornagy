package com.greenfoxacademy.controllers;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Created by Viktor on 2016.12.19..
 */

@Getter
@AllArgsConstructor

public class Greeting {
    @Getter
    long id=1455454654;
    String content="Ez egy content!!";
    int s=1234;

    public Greeting() {

    }
}
