package com.mertkan.eventproject.repository;

import com.mertkan.eventproject.model.Artist;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ArtistRepository extends JpaRepository<Artist, Long> {

    @Query("select artist from Artist artist order by artist.name asc")
    List<Artist> getAll();

    @Query("select artist from Artist artist order by artist.name asc")
    Page<Artist> getArtists(Pageable pageable);

    @Query("select distinct artist from Artist artist where artist.id= :id")
    Artist findByArtistId(@Param("id") Long id);

    Artist findArtistByName(String name);
    Artist findArtistByNameAndId(Long id, String name);


    @Query("select artist from User user join user.likedArtists artist where user.id= :userId")
    List<Artist> findLikedArtists(@Param("userId") Long userId);

}
