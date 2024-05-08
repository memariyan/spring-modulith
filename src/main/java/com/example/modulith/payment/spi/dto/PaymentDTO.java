package com.example.modulith.payment.spi.dto;

import java.util.Date;

public record PaymentDTO(String userId, Date date, Long amount) {

}
