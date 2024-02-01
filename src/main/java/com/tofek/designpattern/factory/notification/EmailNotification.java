package com.tofek.designpattern.factory.notification;

public class EmailNotification implements Notification{

    @Override
    public void notifyUser(String userName) {
        System.out.println("Send the notification via Email to "+userName);
    }
}
