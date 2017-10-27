package se.collectivesunshine.service;

import se.collectivesunshine.entity.User;

import java.util.List;

public interface UserService {

    void insertUser(User user);

    List<User> findAllUsers();
}