package com.mertkan.eventproject.repository;

import com.mertkan.eventproject.model.Event;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.security.core.parameters.P;

import java.time.LocalDate;
import java.util.List;

public interface EventRepository extends JpaRepository<Event, Long> {

    @Query("select event from  Event event order by date asc")
    Page<Event> getAll(Pageable pageable);
    @Query("select event from Event event where event.id= :id")
    Event findByEventId(@Param("id") Long id);
    @Query("select event from Event event where event.date between current_date and :monthEnd order by date asc")
    Page<Event> findTillEndOfMonth(@Param("monthEnd")LocalDate monthEnd, Pageable pageable);
    @Query("select event from Event event where event.date between :monthStart and :monthEnd order by date asc")
    Page<Event> findByMonth(@Param("monthStart") LocalDate monthStart, @Param("monthEnd") LocalDate monthEnd, Pageable pageable);
    @Query("select event from Event event where event.venue= :venueId order by date asc")
    Page<Event> findByVenueId(@Param("venueId") Long venueId, Pageable pageable);
    @Query("select event from Event event where event.venue= :venueId order by date asc")
    Page<Event> findTop3EventsByVenueId(@Param("venueId") Long venueId, Pageable pageable);
    List<Event> findByArtists_Id(Long id);
    Page<Event> findByArtists_Id(@Param("artistId") Long id, Pageable pageable);


}
