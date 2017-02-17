package com.charlieperson;

public enum Animal {
    DOG("Snoop", 44), CAT("Tom", 108), MOUSE("Jerry", 108);

    private String name;
    private int age;

    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "This animal's name is " + name;
    }
}
