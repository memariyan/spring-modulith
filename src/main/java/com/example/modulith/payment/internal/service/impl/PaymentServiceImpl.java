package com.example.modulith.payment.internal.service.impl;

import com.example.modulith.notification.spi.dto.NotificationDTO;
import com.example.modulith.notification.spi.NotificationSPI;
import com.example.modulith.payment.internal.service.PaymentService;
import com.example.modulith.payment.internal.service.model.Payment;
import com.example.modulith.user.spi.UserSPI;
import com.example.modulith.user.spi.dto.UserDTO;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class PaymentServiceImpl implements PaymentService {

    private final ApplicationEventPublisher events;
    private final UserSPI userService;

    public PaymentServiceImpl(ApplicationEventPublisher events, UserSPI userService) {
        this.events = events;
        this.userService = userService;
    }

    @Override
    public void pay(Payment payment) {

        //sync user call
        UserDTO user = userService.getUserDetails(payment.getUserId());

        //doing payment

        //async notification call
        events.publishEvent(new NotificationDTO(user.email(), "successful payment"));

    }
}