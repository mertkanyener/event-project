package com.mertkan.eventproject.service;

import com.mertkan.eventproject.model.User;

public interface UserService {

    void save(User user);
    User findByUsername(String username);

}
