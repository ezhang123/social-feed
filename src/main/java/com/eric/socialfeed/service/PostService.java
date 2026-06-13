package com.eric.socialfeed.service;

import com.eric.socialfeed.model.Account;
import com.eric.socialfeed.model.Post;
import com.eric.socialfeed.repository.AccountRepository;
import com.eric.socialfeed.repository.PostRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    private final PostRepository postRepository;
    private final AccountRepository accountRepository;

    public PostService(PostRepository postRepository, AccountRepository accountRepository){
        this.postRepository = postRepository;
        this.accountRepository = accountRepository;
    }

    public List<Post> getPosts() {
        return postRepository.findAll();
    }

    public Post createPost(Post post, Integer accountId) {

        Account account = getAccountById(accountId);

        post.setAccount(account);

        return postRepository.save(post);
    }


    public void deletePost(int id){

        if(postRepository.existsById(id)) {
            postRepository.deleteById(id);
        } else {
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND,
                    "Post not found"
            );
        }
    }

    public Post updatePost(int id, Post updatePost) {

        Post existingPost = postRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Post not found"));

        existingPost.setContent(updatePost.getContent());

        return postRepository.save(existingPost);
    }

    private Account getAccountById(int id) {
        return accountRepository.findById(id).orElseThrow(
                () -> new RuntimeException("Account not found")
        );
    }

}
