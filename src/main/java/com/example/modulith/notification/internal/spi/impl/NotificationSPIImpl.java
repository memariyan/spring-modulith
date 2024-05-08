package com.example.modulith.notification.internal.spi.impl;

import com.example.modulith.notification.spi.dto.NotificationDTO;
import com.example.modulith.notification.spi.NotificationSPI;
import com.example.modulith.notification.internal.spi.mapper.NotificationSPIMapper;
import com.example.modulith.notification.internal.service.NotificationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class NotificationSPIImpl implements NotificationSPI {

    private static final Logger LOG = LoggerFactory.getLogger(NotificationSPIImpl.class);

    private final NotificationService service;

    private final NotificationSPIMapper mapper;

    public NotificationSPIImpl(NotificationService service, NotificationSPIMapper mapper) {
        this.service = service;
        this.mapper = mapper;
    }

    @Override
    @EventListener
    public void sendNotification(NotificationDTO event) {
        LOG.info("Received notification by event  {}.", event);
        service.sendNotification(mapper.toEntity(event));
    }

}