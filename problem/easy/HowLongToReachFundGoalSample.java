package problem.easy;

public class HowLongToReachFundGoalSample {
    /**
    * 毎年の土地価格と年利を含めた投資額を比較し、購入できるまでの投資年数を計算結果を返す
     * @return year 購入出来るまでの投資年数<p>
     *   ただし、80年を超える場合は80年を必ず返す
     */
    private static int howLongToReachFundGoal(int capitalMoney, int goalMoney, int interest) {
        // 毎年の金額の計算を再帰処理して、結果を返す
            // 繰り返し処理を行うのは、毎年分の土地価格と年利を含めた投資額の金額計算
        return howLongToReachFundGoalHelper(capitalMoney, goalMoney, interest, 1);
    }

    // 再帰処理（土地価格、投資額、年利、投資年数）
        // ベースケース
            // 80年を超えているか
                // 80を返す
            // 投資金額が土地価格より高いか
                // 投資年数を返す

        // 土地価格の計算（次の年分の計算）を呼び出す

        // 年利を含めた投資額の計算（次の年分の計算）
            // 次の年の投資額 = 前の年の投資額 + （前の年の投資額 * （年利 * 0.01））

        // 再度再帰処理を呼び出す（次の投資に移動するので、投資年数をインクリメント）
    private static int howLongToReachFundGoalHelper(int capitalMoney, int goalMoney, int interest, int year) {
       if (year >= 80) {
           return 80;
       } else if (capitalMoney > goalMoney) {
           return year;
       } else {
           return howLongToReachFundGoalHelper(
                   (int)(capitalMoney + (capitalMoney * (interest * 0.01))),
                   calcGoalMoney(year+1, goalMoney),
                   interest,
                   year+1
           );
       }
    }

    // 土地価格計算する
        // もし経過年数（投資年数 - 1）が偶数である場合（「0を含む」なので【投資年数】1年目は、【経過年数】0年に注意）
            // 2%上昇
        // 奇数である場合
            // 3%上昇
    private static int calcGoalMoney(int year, int goalMoney) {
        if ((year - 1) % 2 == 0) {
            return (int)(goalMoney + (goalMoney * 0.02));
        } else {
            return (int)(goalMoney + (goalMoney * 0.03));
        }
    }
}
