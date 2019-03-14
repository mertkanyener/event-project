//package com.mertkan.eventproject.impl;
//
//import com.mertkan.eventproject.model.User;
//import com.mertkan.eventproject.repository.UserRepository;
//import com.mertkan.eventproject.service.UserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.stereotype.Service;
//
//@Service
//public class UserServiceImpl implements UserService {
//
//    @Autowired
//    UserRepository userRepository;
//
//    @Autowired
//    PasswordEncoder passwordEncoder;
//
//    @Override
//    public void save(User user) {
//        user.setPassword(passwordEncoder.encode(user.getPassword()));
//    }
//    @Override
//    public User findByUsername(String username) {
//        return userRepository.findByUsername(username);
//    }
//}
