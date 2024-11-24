package org.example.problem.easy;

public class SumOfAllPrimes {

    public static void main(String[] args) {
        System.out.println(sumOfAllPrimes(1));
        System.out.println(sumOfAllPrimes(2));
        System.out.println(sumOfAllPrimes(3));
        System.out.println(sumOfAllPrimes(100));
        System.out.println(sumOfAllPrimes(1000));
    }

    public static int sumOfAllPrimes(int n) {
        if (n == 1) return 0;

        int result = 0;

        for (int i = 1; i<=n; i++) {
            if (isPrime(i)) {
                result += i;
            }
        }

        return result;
    }

    public static boolean isPrime(int number){
        boolean isPrime = true;

        if (number == 1) return false;
        if (number == 2) return true;

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }

        return isPrime;
    }
}
