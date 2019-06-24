package com.sci.finalproject.demo.service;

import com.sci.finalproject.demo.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);


}