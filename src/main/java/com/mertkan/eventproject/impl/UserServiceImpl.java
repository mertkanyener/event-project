package com.mertkan.eventproject.impl;

import com.mertkan.eventproject.model.User;
import com.mertkan.eventproject.repository.UserRepository;
import com.mertkan.eventproject.service.UserService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    private final PasswordEncoder passwordEncoder;

    public UserServiceImpl(final UserRepository userRepository, final PasswordEncoder passwordEncoder) {
        this.passwordEncoder = passwordEncoder;
        this.userRepository = userRepository;
    }

    @Override
    public void save(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
    }
    @Override
    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }
}
