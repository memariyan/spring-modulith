package com.example.modulith.notification.internal.service.model;

public class Notification {

    public Notification(String email, String text) {
        this.email = email;
        this.text = text;
    }

    private String email;

    private String text;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
