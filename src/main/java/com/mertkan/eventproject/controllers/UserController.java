package com.mertkan.eventproject.controllers;

import com.mertkan.eventproject.model.Event;
import com.mertkan.eventproject.model.Friend;
import com.mertkan.eventproject.model.User;
import com.mertkan.eventproject.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    private final UserService userService;

    public UserController(final UserService userService) { this.userService = userService; }

    @GetMapping(path = "/validation/email/{email}")
    public int findEmail(@PathVariable String email) {
        if (userService.findByEmail(email) != null) {
            return 1;
        } else {
            return 0;
        }
    }

    @GetMapping(path = "/user/{id}")
    public User getUserById(@PathVariable Long id) { return userService.findById(id); }

    @GetMapping(path = "/admin/users/role/{roleId}")
    public List<User> getAll(@PathVariable Long roleId) { return userService.findByRole(roleId); }

    @GetMapping(path = "/user/{userId}/event/{eventId}/friends")
    public List<User> getFriendsByAttendingEvent(@PathVariable Long userId, @PathVariable Long eventId) { return userService.findFriendsByAttendingEvents(eventId, userId); }

    @GetMapping(path = "/events/{eventId}/saved/users")
    public List<User> getUsersBySavedEvent(@PathVariable Long eventId) { return userService.findUserBySavedEvents(eventId); }

    @GetMapping(path = "/user/friends/find/{id}")
    public Friend getFriend(@PathVariable Long id) { return userService.findFriend(id); }

    @GetMapping(path = "/user/{id}/friends")
    public List<Friend> getFriendsByUserId(@PathVariable Long id) { return userService.findFriendsByUserId(id); }


    @GetMapping(path = "/user/friends/find")
    public List<Friend> findFriends(@RequestParam String firstName, @RequestParam String lastName) { return userService.findFriendsByName(firstName, lastName); }

    //POST Methods

    @PostMapping(path = "/user/{userId}/friends/add/{friendId}")
    public void addFriend(@PathVariable Long userId, @PathVariable Long friendId) { userService.addFriend(userId, friendId); }

    @PostMapping(path = "/user/{userId}/events/saved/{eventId}")
    public void addSavedEvent(@PathVariable Long userId, @PathVariable Long eventId) { userService.insertSavedEvent(userId, eventId); }

    @PostMapping(path = "/user/{userId}/events/attending/{eventId}")
    public void addAttendingEvent(@PathVariable Long userId, @PathVariable Long eventId) { userService.insertAttendingEvent(userId, eventId); }

    @PostMapping(path = "/user/{userId}/artists/{artistId}")
    public void addLikedArtist(@PathVariable Long userId, @PathVariable Long artistId) { userService.insertLikedArtist(userId, artistId); }

    @PostMapping(path = "/user/{userId}/genres/{genreId}")
    public void addLikedGenre(@PathVariable Long userId, @PathVariable Long genreId) { userService.insertLikedGenre(userId, genreId); }

    @PutMapping(path = "/user/{userId}/image/save")
    public void updateImage(@PathVariable Long userId, @RequestParam String imageLink) { userService.updateImage(userId, imageLink); }

    // DELETE Methods

    @DeleteMapping(path = "/user/{userId}/friends/delete/{friendId}")
    public void deleteFriend(@PathVariable Long userId, @PathVariable Long friendId) { userService.deleteFriend(userId, friendId); }

    @DeleteMapping(path = "/user/{userId}/events/saved/{eventId}")
    public void deleteSavedEvent(@PathVariable Long userId, @PathVariable Long eventId) { userService.deleteSavedEvent(userId, eventId); }

    @DeleteMapping(path = "/user/{userId}/events/attending/{eventId}")
    public void deleteAttendingEvent(@PathVariable Long userId, @PathVariable Long eventId) { userService.deleteAtttendingEvent(userId, eventId); }

    @DeleteMapping(path = "/user/{userId}/artists/{artistId}")
    public void deleteLikedArtist(@PathVariable Long userId, @PathVariable Long artistId) { userService.deleteLikedArtist(userId, artistId); }

    @DeleteMapping(path = "/user/{userId}/genres/{genreId}")
    public void deleteLikedGenre(@PathVariable Long userId, @PathVariable Long genreId) { userService.deleteLikedGenre(userId, genreId); }


}
