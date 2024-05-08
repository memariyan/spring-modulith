package com.example.modulith.payment.spi;

import com.example.modulith.payment.spi.dto.PaymentDTO;

public interface PaymentSPI {

    void pay(PaymentDTO product);

}
