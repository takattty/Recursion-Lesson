package problem.easy;

import java.util.*;

public class MissingItems {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(missingItems(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, new int[]{1, 3, 5})));
        System.out.println(Arrays.toString(missingItems(new int[]{1, 2, 3, 4, 5}, new int[]{1, 2})));
        System.out.println(Arrays.toString(missingItems(new int[]{1, 1}, new int[]{2, 2})));
        System.out.println(Arrays.toString(missingItems(new int[]{9, 8, 7, 6, 5}, new int[]{1, 2})));
    }

    public static int[] missingItems(int[] listA, int[] listB){
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        for (int b : listB) {
            map.put(b, b);
        }

        for (int a : listA) {
            if (map.get(a) == null) list.add(a);
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
