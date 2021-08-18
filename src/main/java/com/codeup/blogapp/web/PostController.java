package com.codeup.blogapp.web;

import com.codeup.blogapp.data.Post;
import com.codeup.blogapp.data.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/api/posts", headers = "Accept=application/json")
public class PostController {

    @GetMapping
    private List<Post> getPosts() {
        return new ArrayList<>() {{
            add(new Post(1L, "A New Post.",
                    "this is a brilliant post."));
        }};
    }

    @GetMapping("{id}")
    private Post getPostById(@PathVariable Long id) {

        User user = new User(1L, "hello", "dfoafe.com", "apdfjae", User.Role.USER, null);
        if (id == 1) {
            return new Post(1L, "A new Post",
                    "this is a brilliant post");
        } else {
            return null;
        }
    }

    @PostMapping
    private void createPost(@RequestBody Post post) {
        System.out.println(post);
    }

    @PutMapping("/{id}")
    private void updatePost(@PathVariable Long id, @RequestBody Post post) {
        System.out.println(id);
        System.out.println(post);
    }

    @DeleteMapping("/{id}")
    private void deletePost(@PathVariable Long id) {
        System.out.println(id);

    }
}

