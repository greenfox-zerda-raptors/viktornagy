package com.reddit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;

/**
 * Created by Viktor on 2017.01.06..
 */
@Entity
@Table(name = "users")
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue
    private long userId;
    private String name;
    private String password;


    public boolean isEqual(User temp) {
        return temp.name == this.name && temp.password == this.password;
    }
}
