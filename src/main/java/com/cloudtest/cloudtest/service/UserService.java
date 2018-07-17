package com.cloudtest.cloudtest.service;

import com.cloudtest.cloudtest.model.User;

import java.util.List;

public interface UserService {

    int addUser(User user);

    User findUserById(String id);
}
