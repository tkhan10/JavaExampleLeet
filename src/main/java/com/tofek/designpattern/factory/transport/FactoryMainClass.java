package com.tofek.designpattern.factory.transport;

public class FactoryMainClass {

    public static void main(String[] args) {
        Transport transport = doCreateTransportation("Truck");
        transport.deliver();

        if(transport instanceof Truck){
            Truck truck = (Truck) transport;
            truck.packagedIn();
        }else if(transport instanceof Car){
            Car car = (Car) transport;
            car.carDriverName();
        }

    }

    /**
     * This is basically a Factory method, where object are creating based on input
     * Client does not know about its object implementation.
     * @param typeOfTrnsportation
     * @return
     */
    public static Transport doCreateTransportation(String typeOfTrnsportation){
        Transport transport = null;
        if(typeOfTrnsportation.equalsIgnoreCase("Truck")){
            transport = new Truck();
        }else if(typeOfTrnsportation.equalsIgnoreCase("Sea")){
            transport = new Sea();
        }else if(typeOfTrnsportation.equalsIgnoreCase("Car")){
            transport = new Car();
        }

        return transport;
    }
}
