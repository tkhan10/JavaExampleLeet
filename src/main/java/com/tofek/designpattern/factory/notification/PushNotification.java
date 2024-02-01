package com.tofek.designpattern.factory.notification;

public class PushNotification implements Notification{

    @Override
    public void notifyUser(String userName) {
        System.out.println("Push notification has been sent to "+userName);
    }
}
