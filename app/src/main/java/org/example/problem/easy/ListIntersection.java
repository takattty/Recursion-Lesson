package org.example.problem.easy;

import java.util.*;

public class ListIntersection {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(listIntersection(new int[]{1, 2, 3, 4, 5, 6}, new int[]{1, 4, 4, 5, 8, 9, 10, 11})));
    }

    public static int[] listIntersection(int[] targetList, int[] searchList){
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        for (int target : targetList) {
            map.put(target, target);
        }

        for (int i : searchList) {
            // 参照先がmapのため、O(1)でアクセス可能に
            if (map.get(i) != null) list.add(i);
        }

        return list.stream().distinct().sorted().mapToInt(Integer::intValue).toArray();
    }
}
