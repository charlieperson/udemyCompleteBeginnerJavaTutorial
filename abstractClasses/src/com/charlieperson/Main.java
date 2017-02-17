package com.charlieperson;

public class Main {

    public static void main(String[] args) {
        Camera camera = new Camera();
        camera.setId(43);
        System.out.println(camera.getId());
        camera.fullUse();

        Car car = new Car();
        car.setId(249);
        System.out.println(car.getId());
        car.fullUse();


    }
}
