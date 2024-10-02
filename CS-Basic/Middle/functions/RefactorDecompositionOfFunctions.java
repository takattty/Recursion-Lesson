package functions;

public class RefactorDecompositionOfFunctions {

    private static int calcIndex(String s) {
        return (int) Math.floor(Math.random() * s.length());
    }
    // messageの作成
    private static String buildMessage(char c, int i) {
       return  "The char [" + c + "] at index " + i;
    }
    private static String randomCharEvenOrOdd() {
        // randomIndexの作成
        int randomIndex = calcIndex("Dont't tell me lies.");

        // characterの作成
        String message = buildMessage("Dont't tell me lies.".charAt(randomIndex), randomIndex);

        if ("Dont't tell me lies.".charAt(randomIndex) % 2 == 0) {
            message += " is Even";
        } else {
            message += " is Odd";
        }
        return message;
    }

    public static void main(String[] args) {
        System.out.println(randomCharEvenOrOdd());
    }
}
