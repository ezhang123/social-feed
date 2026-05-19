package com.eric.socialfeed.controller;

import com.eric.socialfeed.model.Post;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
public class PostController {

    private List<Post> posts = new ArrayList<>();

    public PostController() {
        Post post = new Post();

        //for "fake" initial data to test
        post.setId(1);
        post.setContent("Testing Post 2");

        posts.add(post);
    }

    @GetMapping("/posts")
    public List<Post> getPosts() {
        return posts;
    }

    @PostMapping("/posts")
    public Post createPost(@RequestBody Post post){
        posts.add(post);

        return post;
    }

}
