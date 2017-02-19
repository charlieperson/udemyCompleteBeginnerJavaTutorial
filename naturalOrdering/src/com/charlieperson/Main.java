package com.charlieperson;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	    List<String> list = new ArrayList<>();
	    SortedSet<String> set = new TreeSet<>();

	    addElements(list);
	    addElements(set);

	    Collections.sort(list);

	    showElements(list);
        System.out.println("---------------");
        showElements(set);
    }

    private static void addElements(Collection<String> col) {
        col.add("John");
        col.add("Mike");
        col.add("Dan");
        col.add("Alex");
        col.add("Chuck");
    }

    private static void showElements(Collection<String> col) {
        for(String element: col) {
            System.out.println(element);
        }
    }
}
