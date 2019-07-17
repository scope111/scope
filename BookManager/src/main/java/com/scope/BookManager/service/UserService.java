package com.scope.BookManager.service;

import com.scope.BookManager.dao.UserDAO;
import com.scope.BookManager.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
@Repository
@Service
public class UserService {
    @Autowired
    private UserDAO userDAO;
    public int addUser(User user)
    {
        return userDAO.addUser(user);
    }
    public User getUser(String email) {
        return userDAO.selectByEmail(email);
    }
    public User getUser(int uid) {
        return userDAO.selectById(uid);
    }
}
