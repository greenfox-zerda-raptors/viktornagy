package com.greenfoxacademy.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by Viktor on 2016.12.19..
 */
@Controller
public class HelloWebController {

    AtomicLong counter=new AtomicLong();

    @RequestMapping("/web/greeting")
    public String greeting(Model model,  @RequestParam(name = "name") String s) {

        counter.incrementAndGet();
        model.addAttribute("name", s);
        model.addAttribute("webpage", counter);
        return "greeting";
    }


}

