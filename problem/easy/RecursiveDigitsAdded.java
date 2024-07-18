package problem.easy;

public class RecursiveDigitsAdded {
    public static void main(String[] args) {
        System.out.println("計算結果：　" + recursiveDigitsAdded(5));
        System.out.println("計算結果：　" + recursiveDigitsAdded(8));
        System.out.println("計算結果：　" + recursiveDigitsAdded(12));
        System.out.println("計算結果：　" + recursiveDigitsAdded(98));
        System.out.println("計算結果：　" + recursiveDigitsAdded(3528));
//        System.out.println("計算結果：　" + recursiveDigitsAdded(99999999999884));
        System.out.println("計算結果：　" + recursiveDigitsAdded(5462));
        System.out.println("計算結果：　" + recursiveDigitsAdded(45622943));
        System.out.println("計算結果：　" + recursiveDigitsAdded(9514599));
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

        // c -> c - '0'の部分が何してるか全然わからん
        // charsはIntStreamを返しているので、intでの計算が行われている
        // つまりint - intの計算をしていると思えばいい
        // このintは'0' ~ '9'までを取りうる値。
        // 0 - '0'だと-48で、0 - '1'だと-49になる。charとintは互換性がある。
        return String.valueOf(Long.toString(digits).chars().map(c -> c - '0').sum());
    }
}
