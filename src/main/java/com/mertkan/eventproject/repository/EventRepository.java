package com.mertkan.eventproject.repository;

import com.mertkan.eventproject.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.security.core.parameters.P;

import java.time.LocalDate;
import java.util.List;

public interface EventRepository extends JpaRepository<Event, Long> {

    @Query("select event from Event event where event.id= :id")
    Event findByEventId(@Param("id") Long id);
    @Query("select event from Event event where event.date between current_date and :monthEnd order by date asc")
    List<Event> findTillEndOfMonth(@Param("monthEnd")LocalDate monthEnd);
    @Query("select event from Event event where event.date between :monthStart and :monthEnd")
    List<Event> findByMonth(@Param("monthStart") LocalDate monthStart, @Param("monthEnd") LocalDate monthEnd);
    @Query("select event from Event event where event.venue= :venueId")
    List<Event> findByVenueId(@Param("venueId") Long venueId);
    List<Event> findByArtists_Id(Long id);

}
