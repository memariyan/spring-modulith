package com.example.modulith.user.internal.service.impl;

import com.example.modulith.user.internal.service.UserService;
import com.example.modulith.user.internal.service.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private static final Logger LOG = LoggerFactory.getLogger(UserServiceImpl.class);

    @Override
    public User getUserDetails(String userId) {

        //sample user id
        return new User(userId, "mohammad", "example@gmail.com");
    }

}
