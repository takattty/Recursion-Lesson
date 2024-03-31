package problem.easy;

public class divideBy3Count {
    public static int divideBy3Count(int n){
        return culc(n, 0);
    }

    private static int culc(int n, int count) {
        if (n / 3 == 0) {
            return count;
        } else {
            count++;
            return culc((n/3), count);
        }
    }
}
