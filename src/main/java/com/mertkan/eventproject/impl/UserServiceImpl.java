package com.mertkan.eventproject.impl;

import com.mertkan.eventproject.model.Event;
import com.mertkan.eventproject.model.Role;
import com.mertkan.eventproject.model.User;
import com.mertkan.eventproject.repository.RoleRepository;
import com.mertkan.eventproject.repository.UserRepository;
import com.mertkan.eventproject.service.UserService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    private final RoleRepository roleRepository;

    private final PasswordEncoder passwordEncoder;

    @PersistenceContext
    private final EntityManager entityManager;

    public UserServiceImpl(final UserRepository userRepository, final PasswordEncoder passwordEncoder,
                           final RoleRepository roleRepository, final EntityManager entityManager) {
        this.passwordEncoder = passwordEncoder;
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
        this.entityManager = entityManager;
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

    @Override
    public List<User> findByRole(Long roleId) { return this.userRepository.findByRoleId(roleId); }

    @Override
    @Transactional
    public void insertSavedEvent(Long userId, Long eventId) {
        entityManager.createNativeQuery("INSERT INTO user_saved_events (user_id, event_id) VALUES (?,?)")
                .setParameter(1, userId)
                .setParameter(2, eventId)
                .executeUpdate();
    }
}
