package org.example.problem.easy;

import java.util.*;

public class FindPairs {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(findPairs(new int[]{10, 12, 13, 14, 15, 16, 16, 7, 7, 8})));
    }

    public static int[] findPairs(int[] numbers){
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> resultList = new ArrayList<>();

        for (int i : numbers) {
            map.merge(i, 1, Integer::sum);
        }

        for (Integer e : map.keySet()) {
            if (Objects.equals(map.get(e), 2)) {
                resultList.add(e);
            }
        }
        Collections.sort(resultList);

        int[] result = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++){
            result[i] = resultList.get(i);
        }

        return result;

        // リファクタ
        // Listからint[]への変換をstreamを使って簡潔に
        // return resultList.stream().mapToInt(Integer::intValue).toArray();

        // int[]からListへの変換
        //Arrays.stream(intArray).boxed().collect(Collectors.toList());
    }
}
