package com.mertkan.eventproject.repository;

import com.mertkan.eventproject.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends JpaRepository<User, Long> {

    @Query("SELECT DISTINCT user FROM User user WHERE user.email= :email")
    User findByEmail(@Param("email") String email);

}
