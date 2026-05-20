package com.eric.socialfeed.service;

import com.eric.socialfeed.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostService {

    private List<Post> posts = new ArrayList<>();

    public PostService(){

        Post post = new Post();

        post.setId(1);
        post.setContent("Testing service post");

        posts.add(post);

    }

    public List<Post> getPosts() {
        return posts;
    }

    public Post createPost(Post post) {

        posts.add(post);

        return post;
    }

}
