package com.charlieperson;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	    List<Person> list = new ArrayList<>();
	    SortedSet<Person> set = new TreeSet<>();

	    addElements(list);
	    addElements(set);

	    Collections.sort(list);

	    showElements(list);
        System.out.println("---------------");
        showElements(set);
    }

    private static void addElements(Collection<Person> col) {
        col.add(new Person("John"));
        col.add(new Person("Mike"));
        col.add(new Person("Dan"));
        col.add(new Person("Alex"));
        col.add(new Person("Chuck"));
    }

    private static void showElements(Collection<Person> col) {
        for(Person element: col) {
            System.out.println(element.getName());
        }
    }
}
