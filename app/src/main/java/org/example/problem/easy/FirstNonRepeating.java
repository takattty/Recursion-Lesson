package org.example.problem.easy;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeating {
    public static void main(String[] args) {
        System.out.println(firstNonRepeating("aabbcdddeffg"));
        System.out.println(firstNonRepeating("abcdabcdf"));
        System.out.println(firstNonRepeating("aabbbccdd"));
    }

    public static int firstNonRepeating(String s){
        Map<Character, Integer> map = new LinkedHashMap<>();

        for (char e : s.toCharArray()) {
            map.merge(e, 1, Integer::sum);
        }

        for (var e : map.keySet()) {
            if (map.get(e) == 1) {
                return s.indexOf(e);
            }
        }

        return -1;
    }
}
