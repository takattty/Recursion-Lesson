package problem.easy;

public class FizzBuzz {

    public static void main(String[] args) {
        System.out.println(fizzBuzz(7));
        System.out.println(fizzBuzz(16));
        System.out.println(fizzBuzz(30));
    }

    public static String fizzBuzz(int n){
        StringBuilder sb = new StringBuilder();

        for (int i=1; i<=n; i++) {
            if (i % 15 == 0) {
                sb.append("FizzBuzz").append("-");
            } else if (i % 3 == 0) {
                sb.append("Fizz").append("-");
            } else if (i % 5 == 0) {
                sb.append("Buzz").append("-");
            } else {
                sb.append(i).append("-");
            }
        }

        if (sb.charAt(sb.length() - 1) == '-') {
            sb.deleteCharAt(sb.length() - 1);
        }

        return sb.toString();
    }
}
