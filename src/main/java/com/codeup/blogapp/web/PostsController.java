package com.codeup.blogapp.web;

import com.codeup.blogapp.data.Post;
import com.codeup.blogapp.data.PostsRepository;
import com.codeup.blogapp.services.EmailService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/api/posts", headers = "Accept=application/json")
public class PostsController {

    private final PostsRepository postsRepository;
    private final EmailService emailService;



    public PostsController(PostsRepository postsRepository, EmailService emailService) {
        this.postsRepository = postsRepository;
        this.emailService = emailService;
    }

    @GetMapping
    private List<Post> getPosts() {
        return postsRepository.findAll();
    }

    @GetMapping("{id}")
    private Optional<Post> getPostById(@PathVariable Long id) {
        return postsRepository.findById(id);
    }

    @PostMapping
    private void createPost(@RequestBody Post post) {
        postsRepository.save(post);
        emailService.prepareAndSend(post, "Test Subject", "Test Body");
    }

    @PutMapping("/{id}")
    private void updatePost(@PathVariable Long id, @RequestBody Post post) {
       postsRepository.save(post);
    }

    @DeleteMapping("/{id}")
    private void deletePost(@PathVariable Long id) {
       postsRepository.deleteById(id);

    }
}

