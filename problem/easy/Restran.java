package problem.easy;

public class Restran {

  public static double processPayment(String creditCardType, int cost) {
    if (isNotSupportCard(creditCardType)) {
      return -1.0;
    }

    double totalPrice = calcTotalPrice(cost);
    return isThreeThousandOver(totalPrice);
  }

  private static boolean isNotSupportCard(String creditCardType) {
      return !creditCardType.equals("Visa") && !creditCardType.equals("MasterCard");
  }

  private static double calcTotalPrice(int cost) {
    double salesTax = 0.1;
      return cost * (1 + salesTax + calcChip(cost));
  }

  protected static double calcChip(int cost) {
    if (cost % 3 == 0) {
      return 0.03;
    } else if (cost % 5 == 0) {
      return 0.05;
    } else if (cost % 7 == 0) {
      return 0.07;
    } else {
      return 0.1;
    }
  }

  private static double isThreeThousandOver(double totalPrice) {
    if (totalPrice > 300)
      return -0.1;
    return totalPrice;
  }
}
