package org.example.problem.easy;

public class divideBy3Count {
    public static void main(String[] arg) {
        System.out.println(culc(10, 0));
    }

    private static int culc(int n, int count) {
        if (n / 3 == 0) {
            return count;
        } else {
            count++;
            return culc((n/3), count);
        }
    }
}
