package com.ayeren.blogger.services;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.ayeren.blogger.entities.User;
import com.ayeren.blogger.repositories.UserRepository;

@Service
public class UserServiceImpl implements UserService{

    private final UserRepository repository;


    public UserServiceImpl(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public void createUser(User user) {
       repository.save(user);
    }

    @Override
    public Optional<User> getUserById(Long id) {
       return repository.findById(id);
    }

    @Override
    public Optional<User> getUserByUsername(String username) {
       return repository.findByUsername(username);
    }

}
