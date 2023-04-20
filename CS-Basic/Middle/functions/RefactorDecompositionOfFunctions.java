package functions;

public class RefactorDecompositionOfFunctions {

    private static int getRandomIndex(String s) {
        return (int) Math.floor(Math.random() * s.length());
    }

    private static String buildMessage(boolean isEven, char c, int i) {
        String message = "The char [" + c + "] at index " + i;

        if (isEven) {
            message = message + " is Even";
        } else {
            message = message + " is Odd";
        }

        return message;
    }
    private static String randomCharEvenOrOdd(String s) {
        // randomIndexの作成
        int randomIndex = getRandomIndex(s);

        // characterの作成
        char character = s.charAt(randomIndex);

        // isEvenの判定
        boolean isEven = (character % 2 == 0);

        // 出力文字の組み立て（isEvenとcharacterとrandomIndex）

        return buildMessage(isEven, character, randomIndex);
    }

    public static void main(String[] args) {
        System.out.println(randomCharEvenOrOdd("Dont't tell me lies."));
    }
}
