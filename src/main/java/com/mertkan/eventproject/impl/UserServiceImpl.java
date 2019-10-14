package com.mertkan.eventproject.impl;

import com.mertkan.eventproject.model.Role;
import com.mertkan.eventproject.model.User;
import com.mertkan.eventproject.repository.RoleRepository;
import com.mertkan.eventproject.repository.UserRepository;
import com.mertkan.eventproject.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    private final RoleRepository roleRepository;

    private final PasswordEncoder passwordEncoder;

    private static final Long LIMIT = 10000000000L;
    private static Long last = 0L;


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
        if (!user.isFacebookUser()) {
            Long id = System.currentTimeMillis() % LIMIT;
            if ( id <= last ) {
                id = (last + 1) % LIMIT;
            }
            last = id;
            Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
            logger.info("ID: " + id.toString());
            user.setId(id);
        }
        Set<Role> roles = new HashSet<Role>();
        roles.add(roleRepository.findRoleById(2L));
        user.setRoles(roles);
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userRepository.save(user);
    }

    @Override
    public User findById(Long id) { return this.userRepository.findUserById(id); }

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

    @Override
    @Transactional
    public void insertAttendingEvent(Long userId, Long eventId) {
        entityManager.createNativeQuery("INSERT INTO user_attending_events(user_id, event_id) VALUES (?,?)")
                .setParameter(1, userId)
                .setParameter(2, eventId)
                .executeUpdate();
    }

    @Override
    @Transactional
    public void insertLikedArtist(Long userId, Long artistId) {
        entityManager.createNativeQuery("INSERT INTO user_liked_artists(user_id, artist_id) VALUES (?,?)")
                .setParameter(1, userId)
                .setParameter(2, artistId)
                .executeUpdate();
    }

    @Override
    @Transactional
    public void insertLikedGenre(Long userId, Long genreId) {
        entityManager.createNativeQuery("INSERT INTO user_liked_genres(user_id, genre_id) VALUES (?,?)")
                .setParameter(1, userId)
                .setParameter(2, genreId)
                .executeUpdate();
    }

    @Override
    @Transactional
    public void deleteSavedEvent(Long userId, Long eventId) {
        entityManager.createNativeQuery("DELETE FROM user_saved_events WHERE user_id = ? AND event_id = ?")
                .setParameter(1, userId)
                .setParameter(2, eventId)
                .executeUpdate();
    }

    @Override
    @Transactional
    public void deleteAtttendingEvent(Long userId, Long eventId) {
        entityManager.createNativeQuery("DELETE FROM user_attending_events WHERE user_id = ? AND event_id = ?")
                .setParameter(1, userId)
                .setParameter(2, eventId)
                .executeUpdate();
    }

    @Override
    @Transactional
    public void deleteLikedArtist(Long userId, Long artistId) {
        entityManager.createNativeQuery("DELETE FROM  user_liked_artists WHERE user_id = ? AND artist_id = ?")
                .setParameter(1, userId)
                .setParameter(2, artistId)
                .executeUpdate();
    }

    @Override
    @Transactional
    public void deleteLikedGenre(Long userId, Long genreId) {
        entityManager.createNativeQuery("DELETE FROM user_liked_genres WHERE user_id = ? AND genre_id = ?")
                .setParameter(1, userId)
                .setParameter(2, genreId)
                .executeUpdate();
    }

    @Override
    public List<User> findUserBySavedEvents(Long eventId) {
        return userRepository.findUserBySavedEvents(eventId);
    }
}
