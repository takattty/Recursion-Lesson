package problem.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class EvenRange {
    public static void main(String[] args) {
//        System.out.println(Arrays.toString(evenRange(10, 20)));
//        System.out.println(Arrays.toString(evenRange(1, 1)));
//        System.out.println(Arrays.toString(evenRange(3, 29)));

        System.out.println(Arrays.toString(even(10, 20)));
        System.out.println(Arrays.toString(even(1, 1)));
        System.out.println(Arrays.toString(even(3, 29)));
    }

    // 自分実装
//    private static int[] evenRange(int a, int b) {
//        var list = IntStream.range(a, b)
//                .filter(x -> x % 2 == 0)
//                .boxed()
//                .collect(Collectors.toCollection(ArrayList::new));
//
//        int[] result = new int[list.size()];
//        for (int i = 0; i < list.size(); i++) {
//            result[i] = list.get(i);
//        }
//
//        return result;


        // APIリファレンス確認後
        // bまで見てくれないので、失敗になる
//        return IntStream.range(a, b)
//                .filter(x -> x % 2 == 0)
//                .toArray();
//    }

    // リファクタリング後
    private static int[] even(int a, int b) {
        return IntStream.rangeClosed(a, b)
                .filter(n -> n % 2 == 0)
                .toArray();
    }
}
