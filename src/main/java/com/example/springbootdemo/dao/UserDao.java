package com.example.springbootdemo.dao;

import com.example.springbootdemo.bean.User;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface UserDao {

    User getInfo(String name, String password);
}
