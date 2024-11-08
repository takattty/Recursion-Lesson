package problem.easy;

public class TabulationFib {
    // 木構造の結果を下から上にキャッシュする方法をタビュレーションと呼びます
    public static long tabulationFib(int n){
        // これはキャッシュであり、計算済みのフィボナッチ数をすべて保存します
        // 全てを 0 に設定します
        long[] cache = new long[n+1];

        // fib0 は 0、fib1 は 1 であり、他のすべての数は fib(n) = fib(n-1) + fib(n-2) を使って求めることができます
        cache[0] = 0;
        cache[1] = 1;

        // 反復を使って全ての数を求めます
        for (int i = 2; i < n+1; i++){
            cache[i] = cache[i-1] + cache[i-2];
        }

        // n 番目のフィボナッチを返します
        return cache[n];
    }

    public static void main(String[] args){
        // こっちの方は小さい値からnまでを計算していく。
        System.out.println(tabulationFib(50));
    }
}
