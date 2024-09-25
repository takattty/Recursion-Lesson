package problem.easy;

public class MaxAscilString {
    public static void main(String[] args) {
        System.out.println(maxAscilString(new String[]{"Fantastic","Bridge","Superior","Fantastic","Operator"}));
        System.out.println(maxAscilString(new String[]{"HeLlo","HelLo","bridge"}));
    }

    public static int maxAscilString(String[] stringList){
        return calcAsciiSum(stringList);
    }

    private static int calcAsciiSum(String[] list) {
        // 都度ではなく全体で状態が必要なデータは先に初期化が必要
        int maxSum = 0;
        int maxIndex = 0;

        for (int i = 0; i < list.length; i++) {
            // だが都度計算してその時だけ必要なデータは都度定義すれば良い
            int currentSum = list[i].chars().sum();
            if (currentSum > maxSum) {
                maxSum = currentSum;
                maxIndex = i;
            }
        }

        return maxIndex;
    }
}
