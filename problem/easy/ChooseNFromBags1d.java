package problem.easy;

import java.util.ArrayList;

public class ChooseNFromBags1d {
    public static void main(String[] args) {
        // 1 次元配列
        // [[292,39,78,978],[668,6,66,666],[662,876,276,782],[879,869,478,1968]]と等しいです
        int[] unluckyBagOfNumbers = new int[]{292,39,78,978,668,6,66,666,662,876,276,782,879,869,478,1968};

        // unluckyBagOfNumbers は 4 つのバッグを持ち、それぞれには 4 つの数字が含まれています
        printArray(chooseNFromBags1d(10, unluckyBagOfNumbers, 4,4));
    }

    public static int randomInt(int min,int max) {
        return (int)(Math.random()*(max - min + 1) + min);
    }

    public static void printArray(ArrayList<Integer> arrayList) {
        StringBuilder string = new StringBuilder("[");
        for (Integer integer : arrayList) {
            string.append(integer).append(" ");
        }
        System.out.println(string + "]");
    }

    // bagOfNumbers は m x n の 二次元配列です。m 個のバッグ (totalBags) があり、それぞれのバッグが n 個の要素 (numbersPerBag) を持っています
    public static ArrayList<Integer> chooseNFromBags1d(int n, int[] bagOfNumbers,int totalBags,int  numbersPerBag){
        ArrayList<Integer> chosenNumbers = new ArrayList<>();
        int counter = 0;
        while (counter < n){
            // 現在のバッグの範囲を取得します
            // counter が毎度 +1 されるので、currentBagStart　が 0 -> 4 -> 8 -> ... のようにループの度に値が変わります
            // 各範囲の先頭に持っていくための工夫
            int currentBagStart = (counter % totalBags) * numbersPerBag;
            // 各範囲のお尻に持っていくための工夫
            int currentBagEnd = currentBagStart + numbersPerBag;

            // 範囲内から 1 つ数字を選択します
            chosenNumbers.add(bagOfNumbers[randomInt(currentBagStart, currentBagEnd-1)]);
            counter += 1;
        }
        return chosenNumbers;
    }
}
