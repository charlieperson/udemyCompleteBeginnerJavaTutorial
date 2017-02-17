package com.charlieperson;

public enum Animal {
    DOG("Snoop"), CAT("Tom"), MOUSE("Jerry");

    private String name;

    Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
