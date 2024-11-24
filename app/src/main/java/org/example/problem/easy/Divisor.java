package org.example.problem.easy;

public class Divisor {
    public static void main(String[] args) {
        System.out.println(divisor(12));
        System.out.println(divisor(29));
    }

    public static String divisor(int number) {
        StringBuilder result = new StringBuilder();
        for(int i = 1; i <= number; i++) {
            if (number % i == 0 && i == number) {
                result.append(i);
            } else if(number % i == 0) {
                result.append(i).append("-");
            }
        }
        return result.toString();
    }
}
