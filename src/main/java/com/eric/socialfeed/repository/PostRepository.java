package com.eric.socialfeed.repository;

import com.eric.socialfeed.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Integer> {

}
