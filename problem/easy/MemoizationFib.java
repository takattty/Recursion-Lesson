package problem.easy;

public class MemoizationFib {
    // メモ化は、木構造の上から下へと続くアルゴリズムでのキャッシングです
    // 上は最初の値（つまり大きい値）で、下は最後の値（つまり小さい値）を指す
    // なので、途中の値まで計算とかが可能（n=50, 35までの値など）で、これがメリット
    // n から始まり、n-1、n-2、n-3 と下に向かって計算していきます

    // グローバル変数
    public static long[] cache;

    public static long memoizationFib(int totalFibNumbers){
        // キャッシュ内にすでに計算したフィボナッチ数をすべて保存します
        cache = new long[totalFibNumbers+1];

        return memoizationFibHelper(totalFibNumbers);
    }

    // キャッシュを更新するには、このヘルパー関数を使用します
    public static long memoizationFibHelper(int n){

        // キャッシュに値が保存されていない時は再帰処理
        if (cache[n] == 0){
            if(n == 0) cache[n] = 0;
            else if(n == 1) cache[n] = 1;
            else cache[n] = memoizationFibHelper(n-1) + memoizationFibHelper(n-2);
        }

        // キャッシュに値が保存されてる時はその値を返します
        return cache[n];
    }

    public static void main(String[] args){
        System.out.println(memoizationFib(50));
    }
}
