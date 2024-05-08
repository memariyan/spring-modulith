package com.example.modulith.payment.internal.service.model;

import java.util.Date;

public class Payment {

    private String userId;
    private Date date;
    private Long amount;

    public Payment(String userId, Date date, Long amount) {
        this.userId = userId;
        this.date = date;
        this.amount = amount;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }
}