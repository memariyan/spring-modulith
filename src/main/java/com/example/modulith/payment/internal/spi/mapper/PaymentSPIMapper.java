package com.example.modulith.payment.internal.spi.mapper;

import com.example.modulith.payment.spi.dto.PaymentDTO;
import com.example.modulith.payment.internal.service.model.Payment;
import org.springframework.stereotype.Component;

@Component
public class PaymentSPIMapper {

    public Payment toPayment(PaymentDTO dto) {
        return new Payment(dto.userId(),dto.date(),dto.amount());
    }
}
