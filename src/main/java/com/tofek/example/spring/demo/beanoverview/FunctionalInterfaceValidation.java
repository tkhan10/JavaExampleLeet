package com.tofek.example.spring.demo.beanoverview;

public class FunctionalInterfaceValidation{

    public static void main(String[] args) {
        Sumologic sumo = () -> {
            System.out.println("Inside functinal Interface Implementation");
        };
        sumo.printSumoLogs();

    }

}
