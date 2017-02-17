package com.charlieperson;

public class Camera extends Machine {
    public void start(){
        System.out.println("Camera started.");
    }

    public void run() {
        System.out.println("Camera running");
    }

    public void shutDown() {
        System.out.println("Camera shutting down");
    }

}
