package com.mertkan.eventproject.impl;

import com.mertkan.eventproject.model.Role;
import com.mertkan.eventproject.model.User;
import com.mertkan.eventproject.repository.RoleRepository;
import com.mertkan.eventproject.repository.UserRepository;
import com.mertkan.eventproject.service.UserService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    private final RoleRepository roleRepository;

    private final PasswordEncoder passwordEncoder;

    public UserServiceImpl(final UserRepository userRepository, final PasswordEncoder passwordEncoder,
                           final RoleRepository roleRepository) {
        this.passwordEncoder = passwordEncoder;
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
    }

    @Override
    public void save(User user) {
        Set<Role> roles = new HashSet<Role>();
        roles.add(roleRepository.findRoleById(2L));
        user.setRoles(roles);
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userRepository.save(user);
    }

    @Override
    public User findByEmail(String email) {
        return this.userRepository.findByEmail(email);
    }
}
