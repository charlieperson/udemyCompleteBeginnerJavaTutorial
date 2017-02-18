package com.charlieperson;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Xavier");
        names.add("Daniel");
        names.add("Chuck");
        names.add("Bridget");
        names.add("Alex");

        Collections.sort(names);

        for(String name: names) {
            System.out.println(name);
        }

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(55);
        nums.add(3);
        nums.add(1);
        nums.add(13);

        Collections.sort(nums);

        for(Integer num: nums) {
            System.out.println(num);
        }
    }
}
