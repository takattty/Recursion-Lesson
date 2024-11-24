package org.example.problem.medium;

import java.util.*;

public class HasSameType {
    public static void main(String[] args) {
        System.out.println(hasSameType("aabb","yyza"));
        System.out.println(hasSameType("aappl","bbtte"));
        System.out.println(hasSameType("aabb","abab"));
        System.out.println(hasSameType("aappl","bktte"));
        System.out.println(hasSameType("abcd","tso"));
        System.out.println(hasSameType("aappl","bbttb"));

        System.out.println(hasSameType("aaabbccdddaa","jjjddkkpppjj"));
        System.out.println(hasSameType("aappl","bbtte"));
    }

    public static boolean hasSameType(String user1, String user2){
        if (user1.length() != user2.length()) return false;

        char[] array1 = user1.toCharArray();
        char[] array2 = user2.toCharArray();
        Map<String, String> map = new HashMap<>();

        for (int i = 0; i < array1.length; i++) {
            String value1 = String.valueOf(array1[i]);
            String value2 = String.valueOf(array2[i]);

            if (map.get(value1) == null && !map.containsValue(value2)) {
                map.put(value1, value2);
            } else if (map.get(value1) != null && Objects.equals(map.get(value1), value2)) {
                map.put(value1, value2);
            } else {
                return false;
            }
        }

        return true;
    }
}
