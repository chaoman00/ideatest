package com.example.springbootdemo.service;

import com.example.springbootdemo.bean.User;

public interface UserService {
    User login(String name, String password);
}
