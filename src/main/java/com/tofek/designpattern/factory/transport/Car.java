package com.tofek.designpattern.factory.transport;

public class Car implements Transport{

    @Override
    public void deliver() {
        System.out.println("This is delivery in Car");
    }

    public void carDriverName(){
        System.out.println("Amar is car driver name");
    }
}
