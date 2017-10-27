package se.collectivesunshine.service.impl;

import se.collectivesunshine.dao.UserDAO;
import se.collectivesunshine.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import se.collectivesunshine.service.UserService;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO userDAO;

    @Override
    @Transactional
    public void insertUser(User user) {
        userDAO.insertUser(user);
    }

    @Override
    public List<User> findAllUsers() {
        return userDAO.findAllUsers();
    }
}
