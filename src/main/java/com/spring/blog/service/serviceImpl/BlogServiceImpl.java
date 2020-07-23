package com.spring.blog.service.serviceImpl;

import com.spring.blog.model.Post;
import com.spring.blog.repository.BlogRepository;
import com.spring.blog.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class BlogServiceImpl implements BlogService {

    @Autowired
    BlogRepository blogRepository;

    @Override
    public List<Post> findAll() {
        return blogRepository.findAll(sortByIdAsc());
    }

    @Override
    public Post findByUUID(UUID id) {
    	return null;
    }

    @Override
    public Post save(Post post) {
        return blogRepository.save(post);
    }

    private Sort sortByIdAsc() {
        return new Sort(Sort.Direction.DESC, "id");
    }
}
