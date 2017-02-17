package com.charlieperson;

public class Main {

    public static void main(String[] args) {
	    Animal animal = Animal.CAT;

	    switch (animal) {
            case DOG:
                System.out.println("Animal is a dog");
                break;
            case CAT:
                System.out.println("Animal is a cat");
                break;
            case MOUSE:
                System.out.println("Animal is a mouse");
                break;
        }
    }
}
