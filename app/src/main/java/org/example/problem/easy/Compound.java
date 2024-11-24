package org.example.problem.easy;

public class Compound {
  private static final double evenNumberAnnualRate = 0.02;
  private static final double oddNumberAnnualRate = 0.03;

  public static int calculateGoalMoney(int capital, int year) {
    // 関数を完成させてください
    return (int) Math.floor(capital * Math.pow(1 + calculateInterestRate(capital), year));
  }

  public static double calculateInterestRate(int capital) {
    if (capital % 2 == 0) {
      return evenNumberAnnualRate;
    } else {
      return oddNumberAnnualRate;
    }
  }
}