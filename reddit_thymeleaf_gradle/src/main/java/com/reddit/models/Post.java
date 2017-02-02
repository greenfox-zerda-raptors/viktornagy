package com.reddit.models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Viktor on 2017.01.06..
 */
@Entity
@Table(name = "posts")
@Getter
@Setter
@ToString
public class Post {

    @Id
    @GeneratedValue
    private long id;
    private String content;
    private int score;
    @Temporal(TemporalType.TIMESTAMP)
    private Date creationDate;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public Post() {
        creationDate = new Date();
    }

    public void incrementScore() {
        score++;
    }

    public void decrementScore() {
        score--;
    }
}
