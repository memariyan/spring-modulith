package com.example.modulith.user.spi;

import com.example.modulith.user.spi.dto.UserDTO;

public interface UserSPI {

    UserDTO getUserDetails(String userId);

}
