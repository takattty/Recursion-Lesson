package problem.easy;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SearchList {
    public static void main(String[] args) {
        System.out.println(searchList(new int[]{3,10,23,3,4,50,2,3,4,18,6,1,-2},23));
    }

    public static int searchList(int[] numList, int value){
        // int[]からListに変換する処理
        return Arrays.stream(numList).boxed().collect(Collectors.toList()).indexOf(value);
    }
}
