package com.charlieperson;

public class Main {

    public static void main(String[] args) {
	    Animal animal = Animal.DOG;

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

        System.out.println(Animal.DOG);
        System.out.println(Animal.CAT.name());
        System.out.println(Animal.valueOf("DOG"));
    }
}
