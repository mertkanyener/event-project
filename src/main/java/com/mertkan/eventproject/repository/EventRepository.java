package com.mertkan.eventproject.repository;

import com.mertkan.eventproject.model.Event;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Collection;
import java.util.List;

public interface EventRepository extends JpaRepository<Event, Long> {

    @Query("select event from Event event where event.id= :id")
    Event findByEventId(@Param("id") Long id);

    @Query("select event from Event event order by event.startDate asc")
    List<Event> getAll();

    @Query("select event from Event event where event.startDate >= current_date order by event.startDate asc")
    List<Event> getAllComingEvents();

    @Query("select event from Event event where event.startDate < current_date order by event.startDate asc")
    List<Event> getAllPastEvents();

    @Query("select event from Event event where event.startDate between current_date and :monthEnd order by event.startDate asc")
    List<Event> findTillEndOfMonth(@Param("monthEnd")LocalDate monthEnd);

    @Query("select event from Event event join event.venue venue where venue.id= :venueId order by event.startDate asc")
    List<Event> findAllByVenueId(@Param("venueId") Long venueId);

    @Query("select event from Event event join event.venue venue where venue.id= :venueId and event.startDate between :monthStart and :monthEnd ")
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
            "and event.startDate between :monthStart and :monthEnd " +
            "and event.id in ( select event.id from Event event join event.genres genre where genre.id in :genres ) " +
            "order by event.startDate asc")
    List<Event> filterEvents(@Param("cities") Collection<String> cities, @Param("genres") Collection<Long> genres,
                             @Param("monthStart") LocalDate monthStart, @Param("monthEnd") LocalDate monthEnd);

    @Query("select event " +
            "from Event event " +
            "join event.venue venue " +
            "where venue.city in :cities " +
            "and event.startDate between :monthStart and :monthEnd " +
            "order by event.startDate asc")
    List<Event> findEventsByCityAndMonth(@Param("cities") Collection<String> cities, @Param("monthStart") LocalDate monthStart,
                                         @Param("monthEnd") LocalDate monthEnd);

    @Query("select event " +
            "from Event event " +
            "join event.genres genre " +
            "where genre.id in :genres " +
            "and event.startDate between :monthStart and :monthEnd " +
            "order by event.startDate asc")
    List<Event> findEventsByGenreAndMonth(@Param("genres") Collection<Long> genres, @Param("monthStart") LocalDate monthStart,
                                          @Param("monthEnd") LocalDate monthEnd);

    @Query("select event from Event event join event.artists artists where artists.id= :artistId order by event.startDate asc")
    List<Event> findEventsByArtist(@Param("artistId") Long artistId);

    @Query("select event from Event event where event.startDate between :monthStart and :monthEnd order by event.startDate asc")
    List<Event> findEventsByMonth(@Param("monthStart") LocalDate monthStart, @Param("monthEnd") LocalDate monthEnd);

    //Validation methods

    @Query("select event " +
            "from Event event " +
            "join event.artists artist " +
            "where event.startDate= :date " +
            "and event.time= :time " +
            "and artist.id in :artists ")
    List<Event> validateEventArtist(@Param("date") LocalDate date, @Param("time") LocalTime time, @Param("artists") Collection<Long> artists);

    @Query("select event " +
            "from Event event " +
            "join event.artists artist " +
            "where event.startDate= :date " +
            "and event.time= :time " +
            "and artist.id in :artists " +
            "and event.id <> :eventId")
    Event validateEventArtistWithId(@Param("date") LocalDate date, @Param("time") LocalTime time, @Param("artists") Collection<Long> artists, @Param("eventId") Long eventId);

    @Query("select event " +
            "from Event event " +
            "join event.venue venue " +
            "where event.startDate= :date " +
            "and event.time= :time " +
            "and venue.id= :venueId")
    Event validateEventVenue(@Param("date") LocalDate date, @Param("time") LocalTime time, @Param("venueId") Long venueId);

    @Query("select event " +
            "from Event event " +
            "join event.venue venue " +
            "where event.startDate= :date " +
            "and event.time= :time " +
            "and venue.id= :venueId " +
            "and event.id <> :eventId")
    Event validateEventVenueWithId(@Param("date") LocalDate date, @Param("time") LocalTime time, @Param("venueId") Long venueId, @Param("eventId") Long eventId);

    // Pageable methods

    @Query("select event from Event event where event.startDate= :date order by event.time asc")
    Page<Event> findByDate(@Param("date") LocalDate date, Pageable pageable);

    @Query("select event from Event event join event.artists artists where artists.id= :artistId order by event.startDate asc")
    Page<Event> findByArtists_Id(@Param("artistId") Long id, Pageable pageable);

    @Query("select event from Event event join event.venue venue where venue.city= :city order by event.startDate asc")
    Page<Event> findByCity(@Param("city") String city, Pageable pageable);

    @Query("select event from Event event where event.startDate between :monthStart and :monthEnd order by event.startDate asc")
    Page<Event> findByMonth(@Param("monthStart") LocalDate monthStart,
                            @Param("monthEnd") LocalDate monthEnd,
                            Pageable pageable);

    @Query("select event from Event event join event.venue venue where venue.id= :venueId order by event.startDate asc")
    Page<Event> findByVenueId(@Param("venueId") Long venueId, Pageable pageable);

    @Query("select event from  Event event order by event.startDate asc")
    Page<Event> getAll(Pageable pageable);

}
