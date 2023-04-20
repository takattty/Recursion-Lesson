package problem.easy;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("kayak"));
        System.out.println(isPalindrome("recursion"));
        System.out.println(isPalindrome("Top Spot"));
        System.out.println(isPalindrome("Was it a cat I saw"));
    }

    public static boolean isPalindrome(String stringInput){
        String baseInput = stringInput.replaceAll(" ", "").toLowerCase();
        String reverseInput = new StringBuilder(baseInput).reverse().toString().toLowerCase();
        return baseInput.equals(reverseInput);
    }

    public static final int MY_CARD = 10;
    public static String whoIsWinner(int hisCard){
        if (MY_CARD > hisCard) {
            return "you lose";
        } else if (MY_CARD < hisCard) {
            return "you win";
        }
        return "draw";
    }
}
