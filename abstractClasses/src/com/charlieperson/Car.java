package com.charlieperson;

public class Car extends Machine {
    public void start() {
        System.out.println("Car started");
    }

    public void run() {
        System.out.println("Car running");
    }

    public void shutDown() {
        System.out.println("Car shutting down");
    }
}
