package com.example.modulith.notification.spi;

import com.example.modulith.notification.spi.dto.NotificationDTO;
import org.springframework.scheduling.annotation.Async;

public interface NotificationSPI {

    @Async
    void sendNotification(NotificationDTO event);

}
