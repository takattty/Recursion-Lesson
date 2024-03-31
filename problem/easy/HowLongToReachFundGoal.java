package problem.easy;

public class HowLongToReachFundGoal {

    private static final int INIT_YEAR = 0;
    private static final int MAX_YEAR_TO_PURCHASE = 80;
    private static final double RATE_OF_INCREASE_EVEN_YEARS = 0.02;
    private static final double RATE_OF_INCREASE_ODD_YEARS = 0.03;
    private static final double CONVERT_TO_DECIMAL_POINT = 0.01;

    public static void main(String[] args) {
        System.out.println("Year: " + howLongToReachFundGoal(5421,10421,5));
        System.out.println("Year: " + howLongToReachFundGoal(600,10400,7));
        System.out.println("Year: " + howLongToReachFundGoal(5421,30,30));
        System.out.println("Year: " + howLongToReachFundGoal(32555,5200000,12) );
        System.out.println("Year: " + howLongToReachFundGoal(50,35000,65));
        System.out.println("Year: " + howLongToReachFundGoal(10,350000,2));
        System.out.println("Year: " + howLongToReachFundGoal(20000,10050000,30) );
    }


    private static int howLongToReachFundGoal(int capitalMoney, int goalMoney, int interest) {
        return howLongToReachFundGoalHelper(capitalMoney, goalMoney, interest, INIT_YEAR);
    }

    private static int howLongToReachFundGoalHelper(int capitalMoney, int goalMoney, int interest, int year) {
        if (year >= MAX_YEAR_TO_PURCHASE) {
            return MAX_YEAR_TO_PURCHASE;
        } else if (capitalMoney > goalMoney) {
            return year;
        } else {
            return howLongToReachFundGoalHelper(
                    (int)(capitalMoney + (capitalMoney * (interest * CONVERT_TO_DECIMAL_POINT))),
                    resultGoalMoneyCalc(year+1, goalMoney),
                    interest,
                    year+1
            );
        }
    }

    private static int resultGoalMoneyCalc(int year, int goalMoney) {
        return (int)((year - 1) % 2 == 0 ?
                goalMoney + (goalMoney * RATE_OF_INCREASE_EVEN_YEARS) :
                goalMoney + (goalMoney * RATE_OF_INCREASE_ODD_YEARS));
    }
}
