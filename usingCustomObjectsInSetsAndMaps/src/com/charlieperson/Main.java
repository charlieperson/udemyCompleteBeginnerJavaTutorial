package com.charlieperson;

import java.util.*;

class Person {
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return "{ " + id + ": " + name + " }";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (id != person.id) return false;
        return name != null ? name.equals(person.name) : person.name == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person(0, "Alex");
        Person p2 = new Person(1, "Bridget");
        Person p3 = new Person(2, "Charlie");
        Person p4 = new Person(3, "Daniel");
        Person p5 = new Person(4, "Ellie");
        Person p6 = new Person(2, "Charlie");



        Map<Person, Integer> map = new LinkedHashMap<>();
        map.put(p1, 1);
        map.put(p2, 2);
        map.put(p3, 3);
        map.put(p4, 4);
        map.put(p5, 5);
        map.put(p6, 6);

        for(Person key : map.keySet()) {
            System.out.printf("%-5s : %d\n", key, map.get(key));
        }

        Set<Person> set = new LinkedHashSet<>();

        set.add(p1);
        set.add(p2);
        set.add(p3);
        set.add(p4);
        set.add(p5);
        set.add(p6);

        System.out.println("\n" + set);

    }
}
