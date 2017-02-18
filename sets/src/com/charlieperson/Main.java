package com.charlieperson;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
//    	HashSet does not retain order
	    Set<String> set1 = new HashSet<>();

	    set1.add("Alex");
	    set1.add("Bridget");
	    set1.add("Charlie");
	    set1.add("Daniel");
	    set1.add("Elizabeth");

//	    Adding duplicate items does nothing in any type of set - it is simply ignored
		set1.add("Charlie"); // does nothing

        System.out.println("HashSet: \n" + set1 + "\n");

		//	    LinkedHashSet remembers the order in which the items were added
		Set<String> set2 = new LinkedHashSet<>();

		set2.add("first");
		set2.add("second");
		set2.add("third");
		System.out.println("LinkedHashSet: \n" + set2 + "\n");

//		TreeSet stores in natural order
		Set<String> set3 = new TreeSet();
		set3.add("Munchy");
		set3.add("Crunchy");
		set3.add("Bunchy");
		set3.add("Punchy");

		System.out.println("Tree set: \n" + set3 + "\n");

//		-- ITERATION --
		for(String element : set3) {
			System.out.println(element);
		}
		System.out.println("\n");

//		CONTAINS

		if(set2.contains("second")) {
			System.out.println("Contains second");
		}

//		INTERSECTION

		Set<String> compareSetOne = new LinkedHashSet<>();
		Set<String> compareSetTwo = new LinkedHashSet<>();

		compareSetOne.add("Monkey");
		compareSetOne.add("Giraffe");
		compareSetOne.add("Seagull");
		compareSetOne.add("Elephant");

		compareSetTwo.add("John");
		compareSetTwo.add("Cena");
		compareSetTwo.add("Monkey");
		compareSetTwo.add("Elephant");

		Set<String> intersection = new HashSet<>(compareSetOne); // Make a copy of compareSetOne
		intersection.retainAll(compareSetTwo);
		System.out.println("Common elements between compareSetOne and compareSetTwo: " + intersection);

//		Difference
		Set<String> difference = new HashSet<>(compareSetOne);
		difference.removeAll(compareSetTwo);
		System.out.println("Elements that are in compareSetOne, but not in compareSetTwo: " + difference);



    }
}
