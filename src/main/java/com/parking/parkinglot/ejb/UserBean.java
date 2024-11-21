package com.parking.parkinglot.ejb;

import com.parking.parking_lot.entities.User;
import com.parking.parkinglot.common.UserDto;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

import java.util.List;
import java.util.stream.Collectors;

@Stateless
public class UserBean {

    @PersistenceContext
    private EntityManager entityManager;

    public List<UserDto> getAllUsers() {
        List<User> users = entityManager.createQuery("SELECT u FROM User u", User.class).getResultList();
        return users.stream()
                .map(user -> new UserDto(user.getId(), user.getUsername(), user.getEmail()))
                .collect(Collectors.toList());
    }
    public void addUser(String username, String email) {
        User user = new User();
        user.setUsername(username);
        user.setEmail(email);
        entityManager.persist(user);
    }

}
