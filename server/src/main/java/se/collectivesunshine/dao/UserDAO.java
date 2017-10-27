package se.collectivesunshine.dao;

import se.collectivesunshine.entity.User;

import java.util.List;

public interface UserDAO {

    void insertUser(User user);

    List<User> findAllUsers();

}