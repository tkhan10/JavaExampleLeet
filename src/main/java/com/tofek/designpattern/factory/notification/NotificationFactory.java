package com.tofek.designpattern.factory.notification;

public class NotificationFactory {

    public Notification createNotification(String type){
        Notification nf = null;
        if("SMS".equalsIgnoreCase(type)){
            nf = new SMSNotification();
        }else if("Email".equalsIgnoreCase(type)){
            nf = new EmailNotification();
        }else if("Push".equalsIgnoreCase(type)){
            nf = new PushNotification();
        }else if("Drone".equalsIgnoreCase(type)){
            nf = new DroneNotification();
        }

        return nf;
    }
}
