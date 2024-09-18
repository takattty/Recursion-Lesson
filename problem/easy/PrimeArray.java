package problem.easy;

import java.util.Arrays;
import java.util.stream.IntStream;

public class PrimeArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(primeArray(97)));
    }

    public static int[] primeArray(int n){
        return IntStream.rangeClosed(1, n).filter(PrimeArray::isPrime).toArray();
    }

    private static boolean isPrime(int number){
        boolean isPrime = true;

        if (number == 1) {
            return false;
        }

        if (number == 2) {
            return isPrime;
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }

        return isPrime;
    }
}
