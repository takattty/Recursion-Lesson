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

//    public static boolean hasSameType(String user1, String user2){
//        if (user1.length() != user2.length()) return false;
//
//        char[] array1 = user1.toCharArray();
//        char[] array2 = user2.toCharArray();
//        Map<String, String> map = new HashMap<>();
//
//        for (int i = 0; i < array1.length; i++) {
//            String value1 = String.valueOf(array1[i]);
//            String value2 = String.valueOf(array2[i]);
//
//            if (map.get(value1) == null && !map.containsValue(value2)) {
//                map.put(value1, value2);
//            } else if (map.get(value1) != null && Objects.equals(map.get(value1), value2)) {
//                map.put(value1, value2);
//            } else {
//                return false;
//            }
//        }
//
//        return true;
//    }

    // リファクタ
    // この部分用の中身を確認する
    public static boolean hasSameType(String user1, String user2) {
        if (user1 == null || user2 == null || user1.length() != user2.length()) {
            return false;
        }

        Map<Character, Character> charMapping = new HashMap<>();

        for (int i = 0; i < user1.length(); i++) {
//     ここで配列を作る必要を無くしているかつ、Stringへの変換も不要に
            char c1 = user1.charAt(i);
            char c2 = user2.charAt(i);

            Character mappedChar = charMapping.get(c1);
//     条件も減らして、スッキリ。二段に分けるのいい。
            if (mappedChar == null) {
                if (charMapping.containsValue(c2)) {
                    return false;
                }
                charMapping.put(c1, c2);
            } else if (mappedChar != c2) {
                return false;
            }
        }

        return true;
    }
}
