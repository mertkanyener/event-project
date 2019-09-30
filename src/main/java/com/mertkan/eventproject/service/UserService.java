package com.mertkan.eventproject.service;

import com.mertkan.eventproject.model.Event;
import com.mertkan.eventproject.model.User;

import java.util.List;

public interface UserService {

    void save(User user);
    void insertSavedEvent(Long userId, Long eventId);
//    void insertAttendingEvent(Long userId, Long eventId);
//    void insertLikedArtist(Long userId, Long artistId);
    User findByEmail(String email);
    User findById(Long id);
    List<User> findByRole(Long roleId);


}
