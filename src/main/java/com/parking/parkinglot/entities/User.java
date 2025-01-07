package com.parking.parkinglot.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;

import java.util.ArrayList;
import java.util.Collection;

@Entity
public class User {
    private Long id;
    private String username;
    private  String email;
    private String password;
    private Collection<Car> cars = new ArrayList<>();


    @Basic
    @Column(unique = true, nullable = false, length = 100)
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }


    @OneToMany(mappedBy = "owner", orphanRemoval = true)
    public Collection<Car> getCars() {
        return cars;
    }
    public void setCars(Collection<Car> cars) {
        this.cars = cars;
    }


    @Id
    @GeneratedValue
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }


    @Email
    @Column(unique = true, nullable = false, length = 100)
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }


    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;

    }
}