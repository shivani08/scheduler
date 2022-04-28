package com.ual.document.services.implementation;

public class ReminderNotFoundException extends RuntimeException{
    public ReminderNotFoundException() {

        super("Reminder Not Found");
    }
}
