package com.example.modulith.notification.internal.spi.mapper;

import com.example.modulith.notification.spi.dto.NotificationDTO;
import com.example.modulith.notification.internal.service.model.Notification;
import org.springframework.stereotype.Component;

@Component
public class NotificationSPIMapper {

    public Notification toEntity(NotificationDTO dto) {
        return new Notification(dto.email(), dto.text());
    }
}
