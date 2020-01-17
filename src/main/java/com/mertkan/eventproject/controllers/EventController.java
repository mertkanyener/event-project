package com.mertkan.eventproject.controllers;

import com.mertkan.eventproject.model.Event;
import com.mertkan.eventproject.payload.AdminOpsResponse;
import com.mertkan.eventproject.service.EventService;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;


@RestController
public class EventController {

    private final EventService eventService;

    public EventController(final EventService eventService) {
        this.eventService = eventService;
    }

    @GetMapping(path = "/events/page/{page}/size/{size}")
    public Page<Event> getAllEvents(@PathVariable Integer page, @PathVariable Integer size) {
        return eventService.getAll(page, size);
    }

    @GetMapping(path = "/events/{id}")
    public Event getEvent(@PathVariable Long id) {
        return eventService.findByEventId(id);
    }

    @GetMapping(path = "/events/now")
    public List<Event> getEventsThisMonth() {
        return eventService.findTillEndOfMonth();
    }

    @GetMapping(path = "/events/month/{month}/page/{page}/size/{size}")
    public Page<Event> getEventsByMonth(@PathVariable Integer month, @PathVariable Integer page, @PathVariable Integer size) {
        return eventService.findByMonth(month, page, size);
    }

    @GetMapping(path = "/events/venue/{id}/month/{month}/year/{year}")
    public List<Event> getEventsByVenueAndMonth(@PathVariable Long id, @PathVariable Integer month, @PathVariable Integer year) {
        return eventService.findByVenueAndMonth(id, month, year);
    }


    @GetMapping(path = "/events/year/{year}/month/{month}/day/{day}/page/{page}/size/{size}")
    public Page<Event> getEventsByDate(@PathVariable Integer year, @PathVariable Integer month,
                                       @PathVariable Integer day, @PathVariable Integer page,
                                       @PathVariable Integer size) {
        return eventService.findByDate(year, month, day, page, size);
    }

    @GetMapping(path = "/events/venue/{id}/page/{page}/size/{size}")
    public Page<Event> getEventsByVenue(@PathVariable Long id, @PathVariable Integer page, @PathVariable Integer size) {
        return eventService.findByVenueId(id, page, size);
    }

    @GetMapping(path = "/events/artist/{id}/page/{page}/size/{size}")
    public Page<Event> getEventsByArtist(@PathVariable Long id, @PathVariable Integer page, @PathVariable Integer size) {
        return eventService.findByArtists_Id(id, page, size);
    }

    @GetMapping(path = "/events/city/{city}/page/{page}/size/{size}")
    public Page<Event> getEventsByCity(@PathVariable String city, @PathVariable Integer page, @PathVariable Integer size) {
        return eventService.findByCity(city, page, size);
    }

    @GetMapping(path = "/events/name/{name}")
    public List<Event> getEventsByName(@PathVariable String name) {
        return eventService.findByName(name);
    }

    @GetMapping(path = "/events")
    public List<Event> getAllEvents() { return eventService.findAll(); }

    @GetMapping(path = "/events/venue/{id}")
    public List<Event> getAllEventsByVenue(@PathVariable Long id) { return eventService.findAllByVenue(id); }

    @GetMapping(path = "/events/search/{name}")
    public List<Event> searchEventsByName(@PathVariable String name) { return eventService.findEventsByName(name); }

    @GetMapping(path = "/events/filter")
    public List<Event> filterEvents(@RequestParam(required = false) Collection<String> cities, @RequestParam(required = false) Collection<Long> genres,
                                    @RequestParam Integer month, @RequestParam Integer year) {
        if (cities == null && genres != null) {
            return eventService.filterEventsByGenre(genres, month, year);
        } else if (genres == null && cities != null) {
            return eventService.filterEventsByCity(cities, month, year);
        } else if (genres != null && cities != null) {
            return eventService.filterEvents(cities, genres, month, year);
        } else {
            return eventService.findEventsByMonth(month, year);
        }
    }

    @GetMapping(path = "/events/coming")
    public List<Event> getAllComingEvents() { return eventService.findAllComing(); }

    @GetMapping(path = "/events/past")
    public List<Event> getAllPastEvents() { return eventService.findAllPast(); }

    // User methods

    @GetMapping(path = "/user/{userId}/events/saved")
    public List<Event> getSavedEvents(@PathVariable Long userId) { return eventService.findSavedEvents(userId); }

    @GetMapping(path = "/user/{userId}/events/attending")
    public List<Event> getAttendingEvents(@PathVariable Long userId) { return eventService.findAttendingEvents(userId); }

    // Admin methods

    @PostMapping(path = "/admin/events")
    public ResponseEntity<AdminOpsResponse> saveEvent(@RequestBody Event event) {
        if (!eventService.validateEventArtist(event)) {
            return ResponseEntity.badRequest()
                    .body(new AdminOpsResponse(-1l, "The artists of the event have another event at the same date and time!"));
        } else if (!eventService.validateEventVenue(event)) {
            return ResponseEntity.badRequest()
                    .body(new AdminOpsResponse(-1l, "There is another event in the venue at the same date and time!"));
        } else {
            Long id = eventService.save(event);
            return ResponseEntity.ok(new AdminOpsResponse(id, "Event saved successfully!"));
        }

    }


    @PutMapping(path = "/admin/events/{id}")
    public ResponseEntity<AdminOpsResponse> updateEvent(@PathVariable Long id, @RequestBody Event event) {
        event.setId(id);
        if (!eventService.validateEventArtistWithId(event)) {
            return ResponseEntity.badRequest()
                    .body(new AdminOpsResponse(id, "The artists of the event have another event at the same date and time!"));
        } else if (!eventService.validateEventVenueWithId(event)) {
            return ResponseEntity.badRequest()
                    .body(new AdminOpsResponse(id, "There is another event in the venue at the same date and time!"));
        } else {
            eventService.update(event);
            return ResponseEntity.ok(new AdminOpsResponse(id, "Event saved successfully!"));
        }
    }

    @DeleteMapping(path = "/admin/events/{id}")
    public void deleteEvent(@PathVariable Long id) {
        eventService.delete(id);
    }

}
