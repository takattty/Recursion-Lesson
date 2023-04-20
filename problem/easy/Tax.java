package problem.easy;

import java.time.LocalDate;

public class Tax {
  private static double federalTax = 0.21;
  private static double azTax = 0.049;
  private static double caTax = 0.0884;
  private static double txTax = 0;
  private static double ncTax = 0.025;
  private static double otherTax = 0.05;

  public static int calculateCorporationTax(String state, int year, int profit) {
    // double stateTaxPrice = profit * calcStateTax(state);

    // if (isLeapDay(year)) {
    // return (int) Math.ceil(stateTaxPrice);
    // }
    // return (int) Math.ceil((profit * federalTax) + stateTaxPrice);

    if (isLeapDay(year)) {
      return (int) Math.ceil(profit * calcStateTax(state));
    }
    return (int) Math.ceil(profit * (federalTax + calcStateTax(state)));
  }

  private static double calcStateTax(String state) {
    if (state.equals("AZ")) {
      return azTax;
    } else if (state.equals("CA")) {
      return caTax;
    } else if (state.equals("TX")) {
      return txTax;
    } else if (state.equals("NC")) {
      return ncTax;
    } else {
      return otherTax;
    }
  }

  private static boolean isLeapDay(int year) {
    if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0))
      return true;
    return false;
  }
}
