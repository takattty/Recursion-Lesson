package problem.easy;

import java.util.ArrayList;
import java.util.Arrays;

public class AllNPrimesSieve {
    public static void main(String[] args){
        printIntArray(allNPrimesSieve(12));
        System.out.println("-----素数の数----");
        System.out.println(allNPrimesSieve(12).length);
    }

    // エラトステネスのふるいのアルゴリズム
    public static int[] allNPrimesSieve(int n){
        // サイズnのブール値trueを持つリストを生成します。キャッシュ
        // インデックスで考えるのが大事
        boolean[] cache = new boolean[n];
        Arrays.fill(cache, true);
        // ステップを√n回繰り返します。nが素数でないと仮定すると、n = a * bと表すことができるので、aとbの両方が√n 以上になることはありえません。
        // したがって、√n * √n = n は最大合成組み合わせになります。
        for (int currentPrime = 2; currentPrime < Math.ceil(Math.sqrt(n)); currentPrime++){
            // キャッシュ内の素数(p)の倍数をすべてfalseにしていきます。
            // iは2からスタートします
            // ex) cache[2]=true→falseで下の処理
            // ex) cache[2]=false→trueでcontinue
            if (!cache[currentPrime]) continue;

            // 対象の値の倍数を確認するための2
            int i = 2;
            // 倍数を洗い出す処理
            int ip = i * currentPrime;
            while (ip < n){
                cache[ip] = false;
                // i*pをアップデートします。
                // +=1は、次の倍数を計算するための基数をインクリメントするイメージ
                // ex) i=2なら、i=3にして3の倍数のfalse化処理をするイメージ
                i += 1;

                // ここが基数の倍数計算する処理
                // iが倍数確認する用の2なので、利用して計算
                // ex) i(=2) * 3 = 6
                ip = i * currentPrime;
            }
        }

        // キャッシュ内のすべてのtrueのインデックスは素数です。
        ArrayList<Integer> primeNumbersDynamic = new ArrayList<>();
        for (int i = 2; i < cache.length; i++){
            if (cache[i]){
                primeNumbersDynamic.add(i);
            }
        }
        //動的配列を固定配列に
        int[] primeNumbers = new int[primeNumbersDynamic.size()];
        for (int i = 0; i < primeNumbersDynamic.size(); i++){
            primeNumbers[i] = primeNumbersDynamic.get(i);
        }

        return primeNumbers;
    }

    //　配列を表示する関数
    public static void printIntArray(int[] intArr){
        // For文とインデックス演算子を使うことで、配列の各要素にアクセスすることができます。
        // Javaの配列はlengthというプロパティを持っています。lengthで配列のサイズを手に入れます。
        for (int j : intArr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

}
