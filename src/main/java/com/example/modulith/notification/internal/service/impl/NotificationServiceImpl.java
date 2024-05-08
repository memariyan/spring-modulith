package com.example.modulith.notification.internal.service.impl;

import com.example.modulith.notification.internal.service.NotificationService;
import com.example.modulith.notification.internal.service.model.Notification;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class NotificationServiceImpl implements NotificationService {

    private static final Logger LOG = LoggerFactory.getLogger(NotificationServiceImpl.class);

    @Override
    public void sendNotification(Notification notification) {
        LOG.info("notification sent -> email : {}, text : {}.", notification.getEmail(), notification.getText());
    }

}
