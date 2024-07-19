package problem.easy;

public class RecursiveDigitsAdded {
    public static void main(String[] args) {
//        System.out.println("計算結果：　" + recursiveDigitsAdded(5));
//        System.out.println("計算結果：　" + recursiveDigitsAdded(8));
        System.out.println("計算結果：　" + recursiveDigitsAdded(12));
//        System.out.println("計算結果：　" + recursiveDigitsAdded(98));
//        System.out.println("計算結果：　" + recursiveDigitsAdded(3528));
//        System.out.println("計算結果：　" + recursiveDigitsAdded(99999999999884));
//        System.out.println("計算結果：　" + recursiveDigitsAdded(5462));
//        System.out.println("計算結果：　" + recursiveDigitsAdded(45622943));
//        System.out.println("計算結果：　" + recursiveDigitsAdded(9514599));
    }

    private static int recursiveDigitsAdded(long digits) {
        var calcResult = calcDigits(digits);
        if (calcResult.length() == 1) {
            return Integer.parseInt(calcResult);
        }
        return (int)(Long.parseLong(calcResult) + recursiveDigitsAdded(Long.parseLong(calcResult)));
    }

    private static String calcDigits(long digits) {
//        var s = Long.toString(digits).toCharArray();
//        int result = 0;
//        for (char c : s) {
//            result += Integer.parseInt(String.valueOf(c));
//        }
//        return String.valueOf(result);

        // c -> c - '0'の部分が何してるか全然わからん→ある値をchar型で表現してしまったので、それを元の値に直している
        // charsはIntStreamを返しているので、intでの計算が行われている
        // つまりint - intの計算をしていると思えばいい
        // このintは'0' ~ '9'までを取りうる値。
        // 0 - '0'だと-48で、0 - '1'だと-49になる。charとintは互換性がある。
        // Long.toString()で文字列にして、chars()で各桁の値を取り出しやすい形（char）に、
        // そのままだとchar型の値（ある文字に割り当てられたchar型の値の方）で計算をしてしまうので、
        // map()の処理でdigitsで扱っている数値の方に直して、sum()で計算。
        return String.valueOf(Long.toString(digits).chars().map(c -> c - '0').sum());
    }

    // char型について
    // 0 ~ 65535までの整数を扱う型
    // 各数値に割り当てられた文字を表現するために使う
    // JavaはUTF-16を文字コードとして利用
        // 数字を表す文字から'0'を引くと、その文字が表す数値がわかる
        // '0'との足し算で数に対応する数字がわかる
}
