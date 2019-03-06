package com.mertkan.eventproject.repository;

import com.mertkan.eventproject.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EventRepository extends JpaRepository<Event, Long> {

    @Query("select event from Event event where event.id= :id")
    Event findByEventId(@Param("id") Long id);
    @Query("select event from Event event where event.venueId= :venueId")
    List<Event> findByVenueId(@Param("venueId") Long venueId);
    @Query("select  event from Event event where event.artistId= :artistId")
    List<Event> findByArtistId(@Param("artistId") Long artistId);

}
