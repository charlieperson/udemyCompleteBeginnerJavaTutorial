package com.charlieperson;

public class Car extends Machine {
    private String name;
    private int id;

    @Override
    public int getId() {
        return id;
    }

    public void start() {
        System.out.println("Car started");
    }

    public void run() {
        System.out.println("Car running");
    }

    public void shutDown() {
        System.out.println("Car shutting down");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (id != car.id) return false;
        return name != null ? name.equals(car.name) : car.name == null;
    }

}
