package problem.easy;

public class PerfectNumberList {

    public static void main(String[] args) {
        System.out.println(perfectNumberList(3));
        System.out.println(perfectNumberList(6));
        System.out.println(perfectNumberList(28));
        System.out.println(perfectNumberList(100));
        System.out.println(perfectNumberList(496));
        System.out.println(perfectNumberList(1000));
        System.out.println(perfectNumberList(10000));
    }

    public static String perfectNumberList(int n){
        StringBuffer sb = new StringBuffer();

        for (int i = 2; i <= n; i++) {
            if (isPerfectNumber(i)) {
                sb.append(i).append("-");
            }
        }

        if (sb.charAt(sb.length() - 1) == '-') {
            sb.deleteCharAt(sb.length() - 1);
        }

        return sb.toString();
    }

    // 完全数の確認
    // 完全数 = 約数のうち自分を除く残りの値の足し合わせが、自分と一致する数
    // ex) 6 = 1, 2, 3, 6 → 1+2+3=6
    private static boolean isPerfectNumber(int i) {
       return true;
    }
}
