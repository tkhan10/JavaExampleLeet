package com.tofek.practice.reactor;

public class ErrorHandlingMainClass {

    public static void main(String[] args) {
        System.out.println(printNumberMethod(20));
    }

    private static String printNumberMethod(int i) {
        try{
            return doSomethingDangerous(i);
        }catch (Throwable error){
            return "RECOVERED";
        }
    }

    private static String doSomethingDangerous(int i) {
        if(i == 10) {
            return "TEN";
        }else{
            throw new NumberFormatException();
        }
    }
}
