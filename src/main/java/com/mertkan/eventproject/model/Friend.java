package com.mertkan.eventproject.model;

import java.util.List;

public class Friend {

    private Long id;
    private String firstName;
    private String lastName;
    private String image;
    private boolean facebookUser;

    public Friend(Long id, String firstName, String lastName, boolean facebookUser, String image) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.facebookUser = facebookUser;
        this.image = image;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public boolean isFacebookUser() {
        return facebookUser;
    }

    public void setFacebookUser(boolean facebookUser) {
        this.facebookUser = facebookUser;
    }
}
