package com.charlieperson;

class Dog {
    private String name;
    private int age;
    private int id;
    private static int count = 0;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
        this.id = count;
        count++;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class Main {
    public static void main(String[] args) {
        Dog pete = new Dog("pete", 4);
        Dog mrPickle = new Dog("Mister pickle", 9);
        new Dog("YO", 500);
        new Dog("YO", 500);
        new Dog("YO", 500);
        new Dog("YO", 500);

    }
}
