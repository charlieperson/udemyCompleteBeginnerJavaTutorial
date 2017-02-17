package com.charlieperson;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        System.out.println("Testing HashMap");
        testMap(hashMap);
        System.out.println("Testing linkedHashMap");
        testMap(linkedHashMap);
        System.out.println("Testing TreeMap");
        testMap(treeMap);

    }

    public static void testMap(Map<Integer, String> map) {
        map.put(5, "frog");
        map.put(12, "dog");
        map.put(43, "log");
        map.put(11, "prague");
        map.put(9, "sog");
        map.put(3, "fog");

        for(Integer key : map.keySet()) {
            String value = map.get(key);
            System.out.printf("%-2d : %s\n", key, value);

        }
    }
}




















