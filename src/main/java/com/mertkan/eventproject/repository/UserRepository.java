package com.mertkan.eventproject.repository;

import com.mertkan.eventproject.model.Event;
import com.mertkan.eventproject.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

    User findUserById(Long id);
    @Query("SELECT DISTINCT user FROM User user WHERE user.email= :email")
    User findByEmail(@Param("email") String email);
    @Query("select user from User user join user.roles roles where roles.id= :roleId")
    List<User> findByRoleId(@Param("roleId") Long roleId);
    @Query("select event from User user join user.savedEvents event where user.id= :userId")
    List<Event> findSavedEvents(@Param("userId") Long userId);
}