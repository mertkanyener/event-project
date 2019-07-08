package com.mertkan.eventproject.repository;

import com.mertkan.eventproject.model.Artist;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ArtistRepository extends JpaRepository<Artist, Long> {

    @Query("select artist from Artist artist order by artist.name asc")
    Page<Artist> getArtists(Pageable pageable);

    @Query("select distinct artist from Artist artist where artist.id= :id")
    Artist findByArtistId(@Param("id") Long id);

}
