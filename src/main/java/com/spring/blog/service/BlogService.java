package com.spring.blog.service;

import com.spring.blog.model.Post;

import java.util.List;
import java.util.UUID;

public interface BlogService {
    List<Post> findAll();
    Post findByUUID(UUID id);
    Post save(Post post);
}
