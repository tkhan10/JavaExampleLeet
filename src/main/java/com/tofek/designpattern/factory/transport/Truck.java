package com.tofek.designpattern.factory.transport;

public class Truck implements Transport{

    @Override
    public void deliver() {
        System.out.println("This is delivery by Truck");
    }

    public void packagedIn(){
        System.out.println("How can we transport the things in Truck - Boxes");
    }
}
