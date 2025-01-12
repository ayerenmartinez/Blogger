package com.ayeren.blogger.services;

import java.util.Optional;

import com.ayeren.blogger.entities.User;

public interface UserService {
    void createUser(User user);
    Optional<User> getUserById(Long id);
    Optional<User> getUserByUsername(String username);
}
