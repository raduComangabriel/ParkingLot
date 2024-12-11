package com.parking.parkinglot.common;

public class UserDto {
    private Long Id;
    private String Username;
    private String Email;

    public UserDto(Long id, String username, String email) {
        this.Id = id;
        this.Username = username;
        this.Email = email;
    }


    // Getters și setters
    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        this.Id = id;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        this.Username = username;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        this.Email = email;
    }
}