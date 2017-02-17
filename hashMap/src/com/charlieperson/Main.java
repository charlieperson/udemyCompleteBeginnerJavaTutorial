package com.charlieperson;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap();
        map.put(5, "Hamburger");
        map.put(43, "Whatever");
        map.put(3, "Okay");
        map.put(12, "Another useless entry");
        map.put(55, "I love computers");
        map.put(2, "They are amazing");

        for(Map.Entry<Integer, String> entry : map.entrySet()) {
            int key = entry.getKey();
            String value = entry.getValue();

            System.out.printf("%-2d : %s\n", key, value);
        }

    }
}
