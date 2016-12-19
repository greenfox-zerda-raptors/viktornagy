package com.greenfoxacademy.controllers;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by Viktor on 2016.12.19..
 */

@Getter
@AllArgsConstructor

public class Greeting {
    @Getter
    AtomicLong counter;
    String content="Ez egy content!!";

    public Greeting() {

    }
}
