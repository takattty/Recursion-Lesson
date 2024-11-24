package org.example.problem.easy;

import java.util.ArrayList;

public class ChooseNFromBags2d {
    public static void main(String[] args) {
        // それぞれのバッグは4つの数字を含んでいる二次元配列
        int[][] luckyArrayOfBags = new int[][]{{21,5,12,25},{100,88,354,643},{122,145,825,4},{228,674,777,77}};

        printArray(chooseNFromBags2d(10, luckyArrayOfBags));
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

    public static ArrayList<Integer> chooseNFromBags2d(int n, int[][] listOfBags) {
        int  totalBags = listOfBags.length;
        ArrayList<Integer> chosenNumbers = new ArrayList<>();
        int counter = 0;
        while (counter < n){
            // counter % numberOfBags によって、ラウンドロビンができます。バッグの中を循環します。
            // totalBagsが2次元配列のバッグ分の値で、余りで計算してるからバッグ以上の数値にならないから循環できる。
            // でここでバッグを選んでる。
            int[] currentBag = listOfBags[counter % totalBags];
            // 選択された数値を追加します。currentBagからランダムな値が選択されます。
            // 最大値をミスらないように、長さから値を選択。
            chosenNumbers.add(currentBag[randomInt(0, currentBag.length-1)]);
            // counterを1ずつ増加します。
            counter+=1;
        }
        return chosenNumbers;
    }
}
