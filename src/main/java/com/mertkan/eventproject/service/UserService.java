package com.mertkan.eventproject.service;

import com.mertkan.eventproject.model.Event;
import com.mertkan.eventproject.model.User;

import java.util.List;

public interface UserService {

    void save(User user);
    void insertSavedEvent(Long userId, Long eventId);
    void insertAttendingEvent(Long userId, Long eventId);
    void insertLikedArtist(Long userId, Long artistId);
    void insertLikedGenre(Long userId, Long genreId);
    void deleteSavedEvent(Long userId, Long eventId);
    void deleteAtttendingEvent(Long userId, Long eventId);
    void deleteLikedArtist(Long userId, Long artistId);
    void deleteLikedGenre(Long userId, Long genreId);
    User findByEmail(String email);
    User findById(Long id);
    List<User> findByRole(Long roleId);
    List<User> findUserBySavedEvents(Long eventId);

}
