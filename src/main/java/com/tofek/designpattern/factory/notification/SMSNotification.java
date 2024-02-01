package com.tofek.designpattern.factory.notification;

public class SMSNotification implements Notification{

    @Override
    public void notifyUser(String userName) {
        System.out.println("Send the notification via SMS to "+userName);
    }
}
