package problem.easy;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class IntersectionOfArraysRepeats {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(intersectionOfArraysRepeats(new int[]{3, 2, 1}, new int[]{3, 2, 1})));
        System.out.println(Arrays.toString(intersectionOfArraysRepeats(new int[]{3,2,2,2,1,10,10}, new int[]{3,2,10,10,10})));
        System.out.println(Arrays.toString(intersectionOfArraysRepeats(new int[]{-1,-2,-1,-1}, new int[]{-1,-1,-2,-2})));
        System.out.println(Arrays.toString(intersectionOfArraysRepeats(new int[]{4,9,5}, new int[]{9,4,9,8,4})));
    }

    public static int[] intersectionOfArraysRepeats(int[] intList1, int[] intList2){
        Map<Integer, Long> map1 = Arrays.stream(intList1).boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        Map<Integer, Long> map2 = Arrays.stream(intList2).boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        List<Integer> list = new ArrayList<>();

        for (Integer e : map1.keySet()) {
            if (map2.containsKey(e)) {
                long count = Math.min(map1.get(e), map2.get(e));
                for (int i = 0; i < count; i++) {
                    list.add(e);
                }
            }
        }

        // リファクタ（少し見辛いかも？）
//        return map1.entrySet().stream()
//                .filter(entry -> map2.containsKey(entry.getKey()))
//                .flatMapToInt(entry -> {
//                    int num = entry.getKey();
//                    long count = Math.min(entry.getValue(), map2.get(num));
//                    return IntStream.generate(() -> num).limit(count);
//                })
//                .sorted()
//                .toArray();

        return list.stream().sorted().mapToInt(Integer::intValue).toArray();
    }
}
