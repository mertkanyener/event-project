package com.mertkan.eventproject.repository;

import com.mertkan.eventproject.model.Genre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface GenreRepository extends JpaRepository<Genre, Long> {

    @Query("select genre from User user join user.likedGenres genre where user.id= :userId")
    List<Genre> getLikedGenres(@Param("userId") Long userId);

}
