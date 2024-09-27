package problem.easy;

import java.util.ArrayList;
import java.util.Arrays;

public class AllNPrimesSieve {
    public static void main(String[] args){
        printIntArray(allNPrimesSieve(100));
        System.out.println("-----素数の数----");
        System.out.println(allNPrimesSieve(100).length);
    }

    // エラトステネスのふるいのアルゴリズム
    public static int[] allNPrimesSieve(int n){
        // サイズnのブール値trueを持つリストを生成します。キャッシュ
        boolean[] cache = new boolean[n];
        Arrays.fill(cache, true);
        // ステップを√n回繰り返します。nが素数でないと仮定すると、n = a * bと表すことができるので、aとbの両方が√n 以上になることはありえません。
        // したがって、√n * √n = n は最大合成組み合わせになります。
        for (int currentPrime = 2; currentPrime < Math.ceil(Math.sqrt(n)); currentPrime++){
            // キャッシュ内の素数(p)の倍数をすべてfalseにしていきます。
            // iは2からスタートします。
            if (!cache[currentPrime]) continue;
            int i = 2;
            int ip = i * currentPrime;
            while (ip < n){
                cache[ip] = false;
                // i*pをアップデートします。
                i += 1;
                ip = i * currentPrime;
            }
        }

        // キャッシュ内のすべてのtrueのインデックスは素数です。
        ArrayList<Integer> primeNumbersDynamic = new ArrayList<Integer>();
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
