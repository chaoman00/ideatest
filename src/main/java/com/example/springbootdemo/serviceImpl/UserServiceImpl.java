package com.example.springbootdemo.serviceImpl;

import com.example.springbootdemo.bean.User;
import com.example.springbootdemo.dao.UserDao;
import com.example.springbootdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDao userDao;

    @Override
    public User login(String name, String password) {
        return userDao.getInfo(name,password);
    }
}
