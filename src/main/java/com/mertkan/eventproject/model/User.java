package com.mertkan.eventproject.model;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Entity
@Table(name = "users")
public class User implements UserDetails {

    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "email", nullable = false)
    private String email;
    @Column(name = "first_name", nullable = false)
    private String firstName;
    @Column(name = "last_name", nullable = false)
    private String lastName;
    @Column(name = "password")
    private String password;
    @Column(name = "start_date", nullable = false)
    private LocalDate startDate;
    @Column(name = "status", nullable = false)
    private String status;
    @Column(name = "gender")
    private String gender;
    @Column(name = "birth_date")
    private LocalDate birthDate;
    @Column(name = "facebook_user")
    private boolean facebookUser;
    @Column(name = "image")
    private String image;
    @Column(name = "twitter")
    private String twitter;
    @Column(name = "spotify")
    private String spotify;
    @Column(name = "instagram")
    private String instagram;
    @Column(name = "facebook")
    private String facebook;
    @Column(name = "friends")
    @ElementCollection
    private List<Long> friends;
    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "user_role", joinColumns =
    @JoinColumn(name = "user_id"), inverseJoinColumns =
    @JoinColumn(name = "role_id"))
    private Set<Role> roles;
    @ManyToMany
    @JoinTable(name = "user_saved_events", joinColumns =
    @JoinColumn(name = "user_id"), inverseJoinColumns =
    @JoinColumn(name = "event_id"))
    private List<Event> savedEvents;
    @ManyToMany
    @JoinTable(name = "user_attending_events", joinColumns =
    @JoinColumn(name = "user_id"), inverseJoinColumns =
    @JoinColumn(name = "event_id"))
    private List<Event> attendingEvents;
    @ManyToMany
    @JoinTable(name = "user_liked_genres", joinColumns =
    @JoinColumn(name = "user_id"), inverseJoinColumns =
    @JoinColumn(name = "genre_id"))
    private List<Genre> likedGenres;
    @ManyToMany
    @JoinTable(name = "user_liked_artists", joinColumns =
    @JoinColumn(name = "user_id"), inverseJoinColumns =
    @JoinColumn(name = "artist_id"))
    private List<Artist> likedArtists;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

    public List<Event> getSavedEvents() {
        return savedEvents;
    }

    public void setSavedEvents(List<Event> savedEvents) {
        this.savedEvents = savedEvents;
    }

    public List<Event> getAttendingEvents() {
        return attendingEvents;
    }

    public void setAttendingEvents(List<Event> attendingEvents) {
        this.attendingEvents = attendingEvents;
    }

    public List<Genre> getLikedGenres() {
        return likedGenres;
    }

    public void setLikedGenres(List<Genre> likedGenres) {
        this.likedGenres = likedGenres;
    }

    public List<Artist> getLikedArtists() {
        return likedArtists;
    }

    public void setLikedArtists(List<Artist> likedArtists) {
        this.likedArtists = likedArtists;
    }

    public boolean isFacebookUser() {
        return facebookUser;
    }

    public void setFacebookUser(boolean facebookUser) {
        this.facebookUser = facebookUser;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public List<Long> getFriends() {
        return friends;
    }

    public void setFriends(List<Long> friends) {
        this.friends = friends;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTwitter() {
        return twitter;
    }

    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }

    public String getSpotify() {
        return spotify;
    }

    public void setSpotify(String spotify) {
        this.spotify = spotify;
    }

    public String getInstagram() {
        return instagram;
    }

    public void setInstagram(String instagram) {
        this.instagram = instagram;
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return getRoles()
                .stream()
                .map(role -> new SimpleGrantedAuthority("ROLE_" + role.getRole()))
                .collect(Collectors.toList());
    }
    @Override
    public String getPassword() {
        return this.password;
    }

    @Override
    public String getUsername() {
        return this.email;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
