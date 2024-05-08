package com.example.modulith.user.internal.spi.mapper;

import com.example.modulith.user.internal.service.model.User;
import com.example.modulith.user.spi.dto.UserDTO;
import org.springframework.stereotype.Component;

@Component
public class UserSPIMapper {

    public UserDTO toDTO(User user) {
        return new UserDTO(user.getUserId(), user.getName(), user.getEmail());
    }
}
