package com.mertkan.eventproject.repository;

import com.mertkan.eventproject.model.Event;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.Collection;
import java.util.List;

public interface EventRepository extends JpaRepository<Event, Long> {

    @Query("select event from Event event where event.id= :id")
    Event findByEventId(@Param("id") Long id);

    @Query("select event from Event event order by date asc")
    List<Event> getAll();

    @Query("select event from Event event where event.date between current_date and :monthEnd order by date asc")
    List<Event> findTillEndOfMonth(@Param("monthEnd")LocalDate monthEnd);

    @Query("select event from Event event join event.venue venue where venue.id= :venueId order by event.date asc")
    List<Event> findAllByVenueId(@Param("venueId") Long venueId);

    @Query("select event from Event event join event.venue venue where venue.id= :venueId and event.date between :monthStart and :monthEnd ")
    List<Event> findByVenueIdAndMonth(@Param("monthStart") LocalDate monthStart,
                                      @Param("monthEnd") LocalDate monthEnd,
                                      @Param("venueId") Long venueId);

    List<Event> findEventByName(String name);

    @Query("select event from User user join user.savedEvents event where user.id= :userId")
    List<Event> findSavedEvents(@Param("userId") Long userId);

    @Query("select event from User user join user.attendingEvents event where user.id= :userId")
    List<Event> findAttendingEvents(@Param("userId") Long userId);

    @Query("select event from Event event where event.name like :name%")
    List<Event> findEventsByName(@Param("name") String name);

    @Query("select event " +
            "from Event event " +
            "join event.venue venue " +
            "where venue.city in :cities " +
            "and event.date between :monthStart and :monthEnd " +
            "and event.id in ( select event.id from Event event join event.genres genre where genre.id in :genres ) " +
            "order by event.date asc")
    List<Event> filterEvents(@Param("cities") Collection<String> cities, @Param("genres") Collection<Long> genres,
                             @Param("monthStart") LocalDate monthStart, @Param("monthEnd") LocalDate monthEnd);

    @Query("select event " +
            "from Event event " +
            "join event.venue venue " +
            "where venue.city in :cities " +
            "and event.date between :monthStart and :monthEnd " +
            "order by event.date asc")
    List<Event> findEventsByCityAndMonth(@Param("cities") Collection<String> cities, @Param("monthStart") LocalDate monthStart,
                                         @Param("monthEnd") LocalDate monthEnd);

    @Query("select event " +
            "from Event event " +
            "join event.genres genre " +
            "where genre.id in :genres " +
            "and event.date between :monthStart and :monthEnd " +
            "order by event.date asc")
    List<Event> findEventsByGenreAndMonth(@Param("genres") Collection<Long> genres, @Param("monthStart") LocalDate monthStart,
                                          @Param("monthEnd") LocalDate monthEnd);

    @Query("select event from Event event join event.artists artists where artists.id= :artistId order by event.date asc")
    List<Event> findEventsByArtist(@Param("artistId") Long artistId);

    @Query("select event from Event event where event.date between :monthStart and :monthEnd order by event.date asc")
    List<Event> findEventsByMonth(@Param("monthStart") LocalDate monthStart, @Param("monthEnd") LocalDate monthEnd);

    // Pageable methods

    @Query("select event from Event event where event.date= :date order by time asc")
    Page<Event> findByDate(@Param("date") LocalDate date, Pageable pageable);

    @Query("select event from Event event join event.artists artists where artists.id= :artistId order by event.date asc")
    Page<Event> findByArtists_Id(@Param("artistId") Long id, Pageable pageable);

    @Query("select event from Event event join event.venue venue where venue.city= :city order by event.date asc")
    Page<Event> findByCity(@Param("city") String city, Pageable pageable);

    @Query("select event from Event event where event.date between :monthStart and :monthEnd order by date asc")
    Page<Event> findByMonth(@Param("monthStart") LocalDate monthStart,
                            @Param("monthEnd") LocalDate monthEnd,
                            Pageable pageable);

    @Query("select event from Event event join event.venue venue where venue.id= :venueId order by event.date asc")
    Page<Event> findByVenueId(@Param("venueId") Long venueId, Pageable pageable);

    @Query("select event from  Event event order by date asc")
    Page<Event> getAll(Pageable pageable);

}
