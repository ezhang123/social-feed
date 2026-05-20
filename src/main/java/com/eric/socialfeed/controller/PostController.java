package com.eric.socialfeed.controller;

import com.eric.socialfeed.model.Post;
import com.eric.socialfeed.service.PostService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
public class PostController {

    private PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping("/posts")
    public List<Post> getPosts() {
        return postService.getPosts();
    }

    @PostMapping("/posts")
    public Post createPost(@RequestBody Post post){
        return postService.createPost(post);
    }

}
