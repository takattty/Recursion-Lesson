package problem.easy;

import java.util.Arrays;

public class RotateByTimes {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(rotateByTimes(new int[]{1, 2, 3, 4, 5}, 5)));
        System.out.println(Arrays.toString(rotateByTimes(new int[]{4, 23, 104, 435, 5002, 3}, 26)));
    }

    public static int[] rotateByTimes(int[] ids, int n){
        // idsの反転処理+idsの倍処理
        // 偶奇判定後のindexと処理済みのidsで、結果を取得
        int[] resultBeforeReverse = calcRotate(ids.length, append(reverse(ids)), n % ids.length);

        // 更に反転処理して返す
        return reverse(resultBeforeReverse);
    }

    private static int[] reverse(int[] before) {
        int length = before.length;
        int[] reversed = new int[length];

        for (int i = 0; i < length; i++) {
            reversed[length - (i + 1)] = before[i];
        }

        return reversed;
    }

    private static int[] append(int[] input) {
        int[] appended = new int[input.length * 2];
        System.arraycopy(input, 0, appended, 0, input.length);
        System.arraycopy(input, 0, appended, input.length, input.length);

        return appended;
    }

    private static int[] calcRotate(int size, int[] input, int lotteryNumber) {
        int[] result = new int[size];
        // inputのlotterNumberから値を取得し、resultのindex=0からsize分だけ処理を行う
        System.arraycopy(input, lotteryNumber, result, 0, size);

        return result;
    }

    // リファクタ版
    // これは悔しいな
    private static int[] refactorRotateByTimes(int[] ids, int n) {
        int length = ids.length;
        int[] result = new int[length];

        n = n % length;

        // 回転操作
        for (int i = 0; i < length; i++) {
            result[(i + n) % length] = ids[i];
        }

        return result;
    }
}
