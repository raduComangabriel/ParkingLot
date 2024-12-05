package com.parking.parkinglot.common;

public class UserDto {
    private String Id;
    private String Username;
    private Long Email;

    public UserDto(String id, String username, Long email) {
        this.Id = id;
        this.Username = username;
        this.Email = email;
    }

    public UserDto(Long id, String username, String email) {

    }

    // Getters și setters
    public String getId() {
        return Id;
    }

    public void setId(String id) {
        this.Id = id;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        this.Username = username;
    }

    public Long getEmail() {
        return Email;
    }

    public void setEmail(Long email) {
        this.Email = email;
    }
}