package com.mertkan.eventproject.model;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@Entity
@Table(name = "User_")
public class User implements UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "USER_SEQ")
    @SequenceGenerator(sequenceName = "user_seq", initialValue = 2, allocationSize = 1, name = "USER_SEQ")
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "email", nullable = false)
    private String email;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "password")
    private String password;
    @Column(name = "facebook_user")
    private boolean facebookUser;
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "user_role", joinColumns =
    @JoinColumn(name = "user_id"), inverseJoinColumns =
    @JoinColumn(name = "role_id"))
    private List<Role> roles;
    @Column(name = "image")
    private String image;
    @OneToMany
    @JoinTable(name = "user_saved_events", joinColumns =
    @JoinColumn(name = "user_id"), inverseJoinColumns =
    @JoinColumn(name = "event_id"))
    private List<Event> savedEvents;
    @OneToMany
    @JoinTable(name = "user_attending_events", joinColumns =
    @JoinColumn(name = "user_id"), inverseJoinColumns =
    @JoinColumn(name = "event_id"))
    private List<Event> attendingEvents;
    @Column(name = "liked_genres")
    private String[] likedGenres;
    @OneToMany
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

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
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

    public String[] getLikedGenres() {
        return likedGenres;
    }

    public void setLikedGenres(String[] likedGenres) {
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
        return this.name;
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
