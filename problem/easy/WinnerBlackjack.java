package problem.easy;

public class WinnerBlackjack {
    public static void main(String[] args) {
//        System.out.println(winnerBlackjack(new String[]{"♥10","♥6","♣K"},new String[]{"♠Q","♦2","♥K"}));
//        System.out.println(winnerBlackjack(new String[]{"♠3","♠J","♣5"},new String[]{"♣A","♥Q","♣5"}));
//        System.out.println(winnerBlackjack(new String[]{"♥2","♣A","♣8","♥7","♥3"},new String[]{"♥6","♥K","♣5","♥K"}));
        System.out.println(winnerBlackjack(new String[]{"♠A","♥2"},new String[]{"♦3","♠J","♠2"}));
    }

    public static final int loseOfSum = 22; // 22以上だとプレイヤーの負け

    public static boolean winnerBlackjack(String[] playerCards, String[] houseCards){
        int playerPoint = calcCardsPoint(playerCards);
        int housePoint = calcCardsPoint(houseCards);

        return judge(playerPoint, housePoint);
    }

    private static int calcCardsPoint(String[] cards) {
        int result = 0;

        for (String card : cards) {
            result += transformNumber(card.substring(1));
        }

        return result;
    }

    private static int transformNumber(String inputNumber) {
        if (!inputNumber.equals("A") && !inputNumber.equals("J") && !inputNumber.equals("Q") && !inputNumber.equals("K")) {
            return Integer.parseInt(inputNumber);
        }

        return switch (inputNumber) {
            case "A" -> 1;
            case "J" -> 11;
            case "Q" -> 12;
            case "K" -> 13;
            default -> 0;
        };
    }

    private static boolean judge(int playerPoint, int housePoint) {
        // プレイヤーの合計値が21を超えているので、ディーラーの勝利
        if (validateMaxPoint(playerPoint)) return false;

        // ディーラーの手札の合計値が 22 未満でかつプレイヤーのカードの合計値より大きいので、ディーラーの勝利
        if (!validateMaxPoint(housePoint) && housePoint > playerPoint) return false;

        // ドローなら、ディーラーの勝利
        // ドローじゃなければ、プレイヤーの勝利
        return playerPoint != housePoint;
    }

    // 合計が22以上だとtrueで、22より小さいとfalse
    private static boolean validateMaxPoint(int point) {
        return point >= loseOfSum;
    }
}
