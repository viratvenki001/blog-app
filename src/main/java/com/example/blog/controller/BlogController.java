package com.example.blog.controller;

import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.example.blog.model.Blog;
import com.example.blog.repository.BlogRepository;

@RestController
@RequestMapping("/blogs")
public class BlogController {

    private final BlogRepository repo;

    public BlogController(BlogRepository repo) {
        this.repo = repo;
    }

    @GetMapping
    public List<Blog> getAllBlogs() {
        return repo.findAll();
    }

    @PostMapping
    public Blog createBlog(@RequestBody Blog blog) {
        return repo.save(blog);
    }
}
