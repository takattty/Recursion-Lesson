package problem.easy;

public class IsFirstStringLarger {
    public static void main(String[] args) {
        System.out.println(isFirstStringLarger("Fantastic","Bridge"));
//        System.out.println(isFirstStringLarger("Bridge","Fantastic"));
//        System.out.println(isFirstStringLarger("pool","pooling"));
    }

    public static boolean isFirstStringLarger(String s1, String s2){
        return calcAsciiSum(s1.toLowerCase()) > calcAsciiSum(s2.toLowerCase());
    }

    private static int calcAsciiSum(String lowCase) {
        int result = 0;
        char[] chars = lowCase.toCharArray();
        for (var e : chars) {
            result += e;
        }

        return result;
    }
}
