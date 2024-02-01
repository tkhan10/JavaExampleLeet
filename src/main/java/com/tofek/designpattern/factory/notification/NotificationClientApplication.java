package com.tofek.designpattern.factory.notification;

public class NotificationClientApplication {

    public static void main(String[] args) {
        NotificationFactory factory = new NotificationFactory();
        Notification nf = factory.createNotification("Drone");
        nf.notifyUser("Tofek");

    }
}
