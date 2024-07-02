package problem.easy;

public class DoYouFail {

    public static void main(String[] args) {
        System.out.println(doYouFail("AAPPAP"));
        System.out.println(doYouFail("AAPPAA"));
        System.out.println(doYouFail("PAPPA"));
    }

    public static String doYouFail(String string) {
        return (int) string.chars().filter(ch -> ch == 'A').count() <= 2 ? "pass" : "fail";
    }
}
