package problem.medium;

import java.util.*;

public class HasSameType {
    public static void main(String[] args) {
        System.out.println(hasSameType("aabb","yyza"));
        System.out.println(hasSameType("aappl","bbtte"));
        System.out.println(hasSameType("aabb","abab"));
        System.out.println(hasSameType("aappl","bktte"));
        System.out.println(hasSameType("abcd","tso"));
        System.out.println(hasSameType("aappl","bbttb"));
    }

    public static boolean hasSameType(String user1, String user2){
        List<Integer> list1 = createList(user1);
        List<Integer> list2 = createList(user2);

        for (int i = 0; i <= list1.size() - 1; i++) {
            if (list1.size() != list2.size()) return false;

            if (!Objects.equals(list1.get(i), list2.get(i))) return false;
        }

        return true;

    }

    private static List<Integer> createList(String user) {
        char[] chars = user.toCharArray();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i <= chars.length - 1; i++) {
            if (i != 0 && chars[i-1] == chars[i]) {
                list.add(list.get(list.size()-1) + 1);
            } else {
                list.add(1);
            }
        }

        return list;
    }
}
