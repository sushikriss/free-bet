package com.example.betfree.interfaces;

import com.example.betfree.entities.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();

    User getUserById(Long id);

    User createUser(User user);

    User updateUser(User user);

    void deleteUser(Long id);
}
