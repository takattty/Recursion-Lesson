package problem.easy;

public class Factorial {

    public static void main(String[] args) {
        System.out.println(factorial(2));
        System.out.println(factorial(3));
        System.out.println(factorial(5));
        System.out.println(factorial(10));
        System.out.println(factorial(15));
        System.out.println(factorial(20));
    }

    public static long factorial(int n){
        if (n == 1) {
            return 1;
        }

        return n * factorial(n-1);
    }
}
