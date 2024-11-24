package org.example.problem.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FirstRepeatingNumber {
    public static void main(String[] args) {
        System.out.println(firstRepeatingNumber(new int[]{2,12,5,10,9,8}));
        System.out.println(firstRepeatingNumber(new int[]{1,5,3,4,3,1,6}));
        System.out.println(firstRepeatingNumber(new int[]{11,45,32,75,88,15,15}));
    }

    public static int firstRepeatingNumber(int[] nums){
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = Arrays.stream(nums).sorted().boxed().collect(Collectors.toList());

        for (int n : list) {
            if (map.get(n) == null) {
                map.put(n, 0);
            } else {
                map.replace(n, map.get(n) + 1);
            }
        }

        for (int n : list) {
            if (map.get(n) > 0) return n;
        }
        return -1;
    }
}
