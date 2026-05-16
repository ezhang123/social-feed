package com.eric.socialfeed.controller;

import com.eric.socialfeed.model.Post;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PostController {

    @GetMapping("/posts")
    public List<Post> getPosts() {

        Post post = new Post();

        post.setId(1);
        post.setContent("Testing Post");

        List<Post> posts = new ArrayList<>();
        posts.add(post);

        return posts;
    }

}
