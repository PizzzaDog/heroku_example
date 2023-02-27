package ru.aston.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.aston.model.User;
import ru.aston.service.UserService;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/users")
    public User register(@RequestBody User user) {
        return userService.registerUser(user);
    }
}
