package problem.easy;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("計算結果：　" + fibonacci(21000)); //  355243104
        System.out.println("計算結果：　" + fibonacci(21050)); //  1809583217
        System.out.println("計算結果：　" + fibonacci(21080)); //  1753817653
        System.out.println("計算結果：　" + fibonacci(21090)); //  880171992
        System.out.println("計算結果：　" + fibonacci(21100)); // -866845037
        System.out.println("計算結果：　" + fibonacci(21200)); // -4590875
        System.out.println("計算結果：　" + fibonacci(21500)); // -1290876931
        System.out.println("計算結果：　" + fibonacci(22000)); // -267429733
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
