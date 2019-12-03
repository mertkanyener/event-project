package com.mertkan.eventproject.repository;

import com.mertkan.eventproject.model.Event;
import com.mertkan.eventproject.model.Friend;
import com.mertkan.eventproject.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

    User findUserById(Long id);
    List<User> findAll();
    @Query("SELECT DISTINCT user FROM User user WHERE user.email= :email")
    User findByEmail(@Param("email") String email);
    @Query("select user " +
            "from User user " +
            "join user.roles roles " +
            "where user.firstName like :firstName% " +
            "and user.lastName like :lastName% " +
            "and user.id <> :userId " +
            "and roles.id = 2")
    List<User> findUserByName(@Param("firstName") String firstName, @Param("lastName") String lastName, @Param("userId") Long userId);
    @Query("select user from User user join user.roles roles where roles.id= :roleId")
    List<User> findByRoleId(@Param("roleId") Long roleId);
    @Query("select event from User user join user.attendingEvents event where user.id= :userId")
    List<Event> findAttendingEvents(@Param("userId") Long userId);
    @Query("select user from User user join user.savedEvents event where event.id = :eventId")
    List<User> findUserBySavedEvents(@Param("eventId") Long eventId);
    @Query("select user " +
            "from User user " +
            "join user.attendingEvents event " +
            "where event.id= :eventId and user.id in (select friend from User user join user.friends friend where user.id= :userId) ")
    List<User> findFriendsByAttendingEvents(@Param("eventId") Long eventId, @Param("userId") Long userId);
    @Query("select user " +
            "from User user " +
            "where user.id in (select friend from User user join user.friends friend where user.id= :userId)")
    List<User> findFriendsByUserId(@Param("userId") Long userId);


}
