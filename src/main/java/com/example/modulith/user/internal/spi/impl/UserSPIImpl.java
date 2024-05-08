package com.example.modulith.user.internal.spi.impl;

import com.example.modulith.notification.spi.dto.NotificationDTO;
import com.example.modulith.notification.internal.spi.mapper.NotificationSPIMapper;
import com.example.modulith.notification.internal.service.NotificationService;
import com.example.modulith.user.internal.service.UserService;
import com.example.modulith.user.internal.service.model.User;
import com.example.modulith.user.internal.spi.mapper.UserSPIMapper;
import com.example.modulith.user.spi.UserSPI;
import com.example.modulith.user.spi.dto.UserDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class UserSPIImpl implements UserSPI {

    private static final Logger LOG = LoggerFactory.getLogger(UserSPIImpl.class);

    private final UserService service;

    private final UserSPIMapper mapper;

    public UserSPIImpl(UserService service, UserSPIMapper mapper) {
        this.service = service;
        this.mapper = mapper;
    }

    @Override
    public UserDTO getUserDetails(String userId) {
        User user = service.getUserDetails(userId);
        return mapper.toDTO(user);
    }
}