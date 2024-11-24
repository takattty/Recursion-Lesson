package org.example.problem.easy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ShuffledPositions {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(shuffledPositions(new int[]{2, 32, 45}, new int[]{45, 32, 2})));
    }

    public static int[] shuffledPositions(int[] arr, int[] shuffledArr){
        int[] result = new int[arr.length];
        List<Integer> list = Arrays.stream(shuffledArr).boxed().collect(Collectors.toList());

        for(int i = 0; i < arr.length; i++) {
            int e = arr[i];
            result[i] = list.indexOf(e);
        }

        return result;
    }
}
