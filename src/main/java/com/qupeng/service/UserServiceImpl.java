package com.qupeng.service;

import com.qupeng.model.User;
import com.qupeng.service.UserService;

public class UserServiceImpl implements UserService {

    @Override
    public String sayHello() {
        return "Hello, dubbo";
    }

    @Override
    public User getUserById(Integer id) {
        User user = new User();
        user.setId(id);
        return user;
    }
}