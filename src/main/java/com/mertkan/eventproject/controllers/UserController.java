package com.mertkan.eventproject.controllers;

import com.mertkan.eventproject.model.User;
import com.mertkan.eventproject.service.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    private final UserService userService;

    public UserController(final UserService userService) { this.userService = userService; }

    @GetMapping(path = "/validation/email/{email}")
    public int findEmail(@PathVariable String email) {
        if (userService.findByEmail(email) != null) {
            return 1;
        } else {
            return 0;
        }
    }

    @PostMapping(path = "/register")
    public void register(@RequestBody User user) {
        userService.save(user);
    }




}
