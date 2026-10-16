package com.eric.socialfeed.repository;

import com.eric.socialfeed.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Integer> {

    @Query(value = "SELECT * FROM post WHERE LOWER(content) LIKE LOWER(CONCAT('%', :keyword, '%')) ORDER BY id DESC", nativeQuery = true)
    List<Post> searchByContent(@Param("keyword") String keyword);
}
