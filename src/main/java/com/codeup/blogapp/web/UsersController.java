package com.codeup.blogapp.web;

import com.codeup.blogapp.data.User;
import com.codeup.blogapp.data.UsersRepository;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Size;
import java.util.List;

@RestController
@RequestMapping(value ="/api/users", headers ="Accept=application/json" )
public class UsersController {

    private final UsersRepository usersRepository;

    public UsersController(UsersRepository usersRepository){
        this.usersRepository = usersRepository;

    }
    @GetMapping
    private List<User> getUsers() {
        return usersRepository.findAll();
    }

    @GetMapping("{id}")
    private User getUsersByID(@PathVariable Long id) {
        if (id == 1) {
            return new User(1L, "erik again", "fhe.com", "hfaiehf", User.Role.USER, null);
        } else{
            return null;
        }
    }

    @PostMapping
    private void createUser(@RequestBody User user) { usersRepository.save(user); }

    @PutMapping("{id}")
    private void updateUsers(@PathVariable Long id, @RequestBody User user) {
        System.out.println(id);
        System.out.println(user);
    }

    @DeleteMapping("/{id}")
    private void deleteUsers(@PathVariable Long id) {
        usersRepository.deleteById(id);
    }

    @PostMapping("/findByUsername")
    private void findByUsername(@RequestParam String username) {
        System.out.println("Username is: " + username);
    }

    @PostMapping("/findByEmail")
    private void findByEmail(@RequestParam String email) {
        System.out.println("Email is: " + email);
    }

    @PutMapping({"{id}/updatePassword"})
    private void updatePassword(@PathVariable Long id, @RequestParam(required = false) String oldPassword, @Valid @Size(min = 3) @RequestParam String newPassword){
        if(!newPassword.equals(oldPassword)){
            System.out.println("Password for id: " + id + " has been updated!");
            System.out.println("Old password: " + oldPassword);
            System.out.println("New password: " + newPassword);
        }
    }
    

}


