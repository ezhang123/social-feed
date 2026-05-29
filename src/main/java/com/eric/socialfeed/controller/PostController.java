package com.eric.socialfeed.controller;

import com.eric.socialfeed.dto.PostRequest;
import com.eric.socialfeed.model.Post;
import com.eric.socialfeed.service.PostService;
import jakarta.persistence.PostUpdate;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

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
    public Post createPost(@Valid @RequestBody PostRequest request){

        Post post = new Post();

        post.setContent(request.getContent());

        return postService.createPost(post);
    }

    @PutMapping("/posts/{id}")
    public Post updatePost(@PathVariable int id, @Valid @RequestBody PostRequest request){

        Post post = new Post();

        post.setContent(request.getContent());

        return postService.updatePost(id, post);
    }

    @DeleteMapping("/posts/{id}")
    public void deletePost(@PathVariable int id) {
        postService.deletePost(id);
    }

}
