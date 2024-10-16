package problem.easy;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimesUpToNCount {
    public static void main(String[] args) {
        System.out.println(primesUpToNCount(2));
        System.out.println(primesUpToNCount(3));
        System.out.println(primesUpToNCount(5));
        System.out.println(primesUpToNCount(13));
        System.out.println(primesUpToNCount(18));
        System.out.println(primesUpToNCount(89));
        System.out.println(primesUpToNCount(97));
        System.out.println(primesUpToNCount(100));
        System.out.println(primesUpToNCount(367));
        System.out.println(primesUpToNCount(673));
        System.out.println(primesUpToNCount(1000));
        System.out.println(primesUpToNCount(3406));
        System.out.println(primesUpToNCount(20034));
    }

    public static int primesUpToNCount(int n){
        if (n == 0 || n == 1 || n == 2) return 0;

        Boolean[] cache = new Boolean[n];
        Arrays.fill(cache, true);
        cache[0] = false;
        cache[1] = false;

        for (int i = 2; i < Math.ceil(Math.sqrt(n)); i++) {
            int ip = i;
            ip += i;

            cache[ip] = false;

            while(ip < n) {
                cache[ip] = false;
                ip += i;
            }
        }

        // リファクタ
//        int limit = (int) Math.sqrt(n);
//        for (int i = 2; i <= limit; i++) {
//            if (cache[i]) {
//                for (int multiple = i * i; multiple < n; multiple += i) {
//                    cache[multiple] = false;
//                }
//            }
//        }

        int result = 0;
        for(boolean e : cache) {
            if (e) {
                result++;
            }
        }

        // boolean[]からBoolean[]にしないといけない
//        long count = Arrays.stream(cache).filter(x -> x).count();
        // こっちが自然かな？
        long count2 = IntStream.range(0, cache.length)
                .filter(i -> cache[i])
                .count();

        return result;
    }
}
