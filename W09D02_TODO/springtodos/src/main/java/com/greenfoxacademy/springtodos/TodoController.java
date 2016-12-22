package com.greenfoxacademy.springtodos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

/**
 * Created by Viktor on 2016.12.21..
 */
@Controller
@RequestMapping("/todo")
public class TodoController {

    private TodoService todoService;

    @Autowired
    public TodoController(TodoService todoService){
        this.todoService = todoService;
    }

    @RequestMapping({"/", "/list"})
    public String listToDos(@RequestParam(required = false) String active, Model model) {
        if (active != null) {
            ArrayList<Todo> activeTodos = new ArrayList<>();
            for (Todo temp : todoService.getTodos()) {
                if(temp.isDone()) {
                    activeTodos.add(temp);
                }
            }
            model.addAttribute("todoList", activeTodos);
        } else {
            model.addAttribute("todoList", todoService.getTodos());
        }
        return "todo";
    }

}


