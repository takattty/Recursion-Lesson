package problem.easy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ShuffleSuccessRate {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new int[]{shuffleSuccessRate(new int[]{2, 32, 45}, new int[]{45, 32, 2})}));
    }

    public static int shuffleSuccessRate(int[] arr, int[] shuffledArr){
        double top = 0;
        double bottom = arr.length;
        List<Integer> list = Arrays.stream(shuffledArr).boxed().collect(Collectors.toList());

        for(int i = 0; i < arr.length; i++) {
            if (i != list.indexOf(arr[i])) {
                top++;
            }
        }

        return (int) Math.floor((top / bottom) * 100);
    }
}
