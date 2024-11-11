package problem.easy;

public class IsPrime {

    public static void main(String[] args) {
        System.out.println(isPrime(1));
        System.out.println(isPrime(2));
        System.out.println(isPrime(3));
        System.out.println(isPrime(4));
        System.out.println(isPrime(25));
        System.out.println(isPrime(29));
        System.out.println(isPrime(36));
        System.out.println(isPrime(45));
        System.out.println(isPrime(85));
        System.out.println(isPrime(455));

        System.out.println();

        System.out.println(isPrimes(1));
        System.out.println(isPrimes(2));
        System.out.println(isPrimes(3));
        System.out.println(isPrimes(4));
        System.out.println(isPrimes(25));
        System.out.println(isPrimes(29));
        System.out.println(isPrimes(36));
        System.out.println(isPrimes(45));
        System.out.println(isPrimes(85));
        System.out.println(isPrimes(455));

        System.out.println();

        System.out.println(isPrimes(17));
    }

    // 素数問題の基本的な計算
    public static boolean isPrime(int number){
        boolean isPrime = true;

        if (number == 1) {
            return false;
        }

        if (number == 2) {
            return true;
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }

        return isPrime;
    }

    public static boolean isPrimes(int number) {
        if (number == 1) return false;
        if (number == 2) return true;
        if (number % 2 == 0) return false;

        for (int i = 3; i <= Math.sqrt(number); i+=2) {
            if (number % i == 0) return false;
        }

        return true;
    }
}
