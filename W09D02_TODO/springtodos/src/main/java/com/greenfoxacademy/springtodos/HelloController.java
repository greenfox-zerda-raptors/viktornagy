package com.greenfoxacademy.springtodos;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Viktor on 2016.12.20..
 */
@Controller
public class HelloController {

    @RequestMapping("/web/hello")
    public String hello(Model model, @RequestParam(value = "name", required = false, defaultValue = "Thymeleaf") String s) {
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd. HH:mm");
        Date ct=new Date();
        model.addAttribute("webpage", String.format("Hello %s! The date and the time is: %s ", s, simpleDateFormat.format(ct)));
        return "hello";
    }
}
