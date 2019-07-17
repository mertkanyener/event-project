package com.mertkan.eventproject.repository;

import com.mertkan.eventproject.model.Venue;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface VenueRepository extends JpaRepository<Venue, Long> {

    @Query("select distinct venue from Venue venue where venue.id= :id")
    Venue fingByVenueId(@Param("id") Long id);

    @Query("select venue from Venue venue order by name asc")
    Page<Venue> getVenuePage(Pageable pageable);

    @Query("select venue from Venue venue where venue.city= :city order by name asc")
    Page<Venue> getVenueByCity(@Param("city") String city, Pageable pageable);
}
