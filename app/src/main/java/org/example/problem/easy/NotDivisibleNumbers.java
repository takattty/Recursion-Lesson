package org.example.problem.easy;

public class NotDivisibleNumbers {

    public static void main(String[] args) {
        System.out.println(notDivisibleNumbers(20,3));
        System.out.println(notDivisibleNumbers(50,4));
        System.out.println(notDivisibleNumbers(100,2));
    }

    public static String notDivisibleNumbers(int x, int y){
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i<=x; i++) {
            if (i % y != 0) {
                sb.append(i).append("-");
            }
        }

        if (sb.charAt(sb.length() - 1) == '-') {
            sb.deleteCharAt(sb.length() - 1);
        }

        return sb.toString();
    }
}
