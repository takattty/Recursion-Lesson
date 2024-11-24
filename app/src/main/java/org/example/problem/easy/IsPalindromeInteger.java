package org.example.problem.easy;

public class IsPalindromeInteger {

    public static void main(String[] args) {
        System.out.println(isPalindromeInteger(12222));
        System.out.println(isPalindromeInteger(12321));
        System.out.println(isPalindromeInteger(22782));
        System.out.println(isPalindromeInteger(189981));
        System.out.println(isPalindromeInteger(1));
        System.out.println(isPalindromeInteger(987823));
    }

    public static boolean isPalindromeInteger(int n){
        var sb = String.valueOf(n);
        var reverseSb = new StringBuffer(String.valueOf(n)).reverse().toString();

        return sb.equals(reverseSb);
    }
}
