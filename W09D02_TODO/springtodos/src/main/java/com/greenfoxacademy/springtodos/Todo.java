package com.greenfoxacademy.springtodos;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by Viktor on 2016.12.21..
 */
@Getter
@Setter
@AllArgsConstructor
public class Todo {
    @Getter
    @Setter
    int id;
    String title;
    boolean isDone;
    boolean isUrgent;

}
