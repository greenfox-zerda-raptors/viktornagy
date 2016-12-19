package com.greenfoxacademy.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Viktor on 2016.12.19..
 */
@Controller
public class HelloWebController {
    @RequestMapping("/web/greeting")
    public String greeting(Model model) {
        model.addAttribute("name", " World");
        return "greeting";
    }

}
