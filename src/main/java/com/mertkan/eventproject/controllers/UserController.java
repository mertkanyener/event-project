package com.mertkan.eventproject.controllers;

import com.mertkan.eventproject.model.Event;
import com.mertkan.eventproject.model.User;
import com.mertkan.eventproject.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping(path = "/user/{id}")
    public User getUserById(@PathVariable Long id) { return userService.findById(id); }


    @GetMapping(path = "/admin/users/role/{roleId}")
    public List<User> getAll(@PathVariable Long roleId) { return userService.findByRole(roleId); }


    @PostMapping(path = "/user/{userId}/save/event/{eventId}")
    public void saveEvent(@PathVariable Long userId, @PathVariable Long eventId) { userService.insertSavedEvent(userId, eventId); }

}
