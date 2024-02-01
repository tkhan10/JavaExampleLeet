package com.tofek.designpattern.factory.notification;

public class DroneNotification implements Notification{

    @Override
    public void notifyUser(String userName) {
        System.out.println("Send notification via Drone to "+userName);
    }
}
