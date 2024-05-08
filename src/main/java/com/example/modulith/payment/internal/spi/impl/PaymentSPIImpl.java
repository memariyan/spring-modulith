package com.example.modulith.payment.internal.spi.impl;

import com.example.modulith.payment.spi.dto.PaymentDTO;
import com.example.modulith.payment.spi.PaymentSPI;
import com.example.modulith.payment.internal.spi.mapper.PaymentSPIMapper;
import com.example.modulith.payment.internal.service.PaymentService;
import org.springframework.stereotype.Component;

@Component
public class PaymentSPIImpl implements PaymentSPI {

    private final PaymentService service;

    private final PaymentSPIMapper mapper;

    public PaymentSPIImpl(PaymentService service, PaymentSPIMapper mapper) {
        this.service = service;
        this.mapper = mapper;
    }

    @Override
    public void pay(PaymentDTO dto) {
        service.pay(mapper.toPayment(dto));
    }

}
