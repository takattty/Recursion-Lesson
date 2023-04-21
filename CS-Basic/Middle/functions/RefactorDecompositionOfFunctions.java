package functions;

public class RefactorDecompositionOfFunctions {

    private static int calcIndex(String s) {
        return (int) Math.floor(Math.random() * s.length());
    }
    // messageの作成
    private static String buildMessage(char c, int i) {
       return  "The char [" + c + "] at index " + i;
    }
    private static String randomCharEvenOrOdd(String s) {
        // randomIndexの作成
        int randomIndex = calcIndex(s);

        // characterの作成
        char character = s.charAt(randomIndex);

        String message = buildMessage(character, randomIndex);

        if (character % 2 == 0) {
            message = message + " is Even";
        } else {
            message = message + " is Odd";
        }
        return message;
    }

    public static void main(String[] args) {
        System.out.println(randomCharEvenOrOdd("Dont't tell me lies."));
    }
}
