package com.reddit.services;

import com.reddit.models.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Viktor on 2017.01.06..
 */
public interface UserRepository extends CrudRepository <User, Long> {

    User findByName(String name);
    User findByPassword(String password);
}
