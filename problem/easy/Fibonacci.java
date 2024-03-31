package problem.easy;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("計算結果：　" + fibonacci(5));
    }

    public static int fibonacci(int n){
        return fibonacciNumberHelper(0,1,n);
    }

    private static int fibonacciNumberHelper(int fn1, int fn2, int n){
        if(n < 1) {
            return fn1;
        }

        return fibonacciNumberHelper(fn2, fn1+fn2, n-1);
    }
}
