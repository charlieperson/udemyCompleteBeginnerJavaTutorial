package com.charlieperson;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class StringLengthComparator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        int stringOneLength = o1.length();
        int stringTwoLength = o2.length();
        if (stringOneLength == stringTwoLength) {
            return 0;
        } else if(stringOneLength > stringTwoLength) {
            return 1;
        } else {
            return -1;
        }
    }
}

class ReverseAlphabeticalComparator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return -o1.compareTo(o2);
    }
}

public class Main {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Xavier");
        names.add("Daniel");
        names.add("Chuck");
        names.add("Bridget");
        names.add("Alex");

        Collections.sort(names, new ReverseAlphabeticalComparator());

        for(String name: names) {
            System.out.println(name);
        }

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(55);
        nums.add(3);
        nums.add(1);
        nums.add(13);

        Collections.sort(nums, new Comparator<Integer>() {
            @Override
            public int compare(Integer num1, Integer num2) {
                return -num1.compareTo(num2);
            }
        });

        for(Integer num: nums) {
            System.out.println(num);
        }

//        SORTING OBJECTS
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("Edward", 0));
        people.add(new Person("Sally", 12));
        people.add(new Person("Alex", 4));
        people.add(new Person("Bridget", 5));

        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person first, Person second) {
                return first.getName().compareTo(second.getName());
            }
        });

        for(Person person: people) {
            System.out.println(person.getName());
        }
    }
}
