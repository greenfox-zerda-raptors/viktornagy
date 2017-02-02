package com.reddit.services;

import com.reddit.models.Post;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Viktor on 2017.01.06..
 */
public interface PostRepository extends CrudRepository<Post, Long> {

    List<Post> findAllByOrderByScoreDesc();

    List<Post> findAllByUserUserId(Long userId);
}
