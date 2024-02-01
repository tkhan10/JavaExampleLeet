package com.tofek.designpattern.factory.transport;

public class Sea implements Transport{
    @Override
    public void deliver() {
        System.out.println("This is delivery by Ship");
    }

    public void howToPack(){
        System.out.println("How can we transport the things in sea - Container");
    }
}
