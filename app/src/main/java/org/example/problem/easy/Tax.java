package org.example.problem.easy;

public class Tax {
  private static final double federalTax = 0.21;
  private static final double azTax = 0.049;
  private static final double caTax = 0.0884;
  private static final double txTax = 0;
  private static final double ncTax = 0.025;
  private static final double otherTax = 0.05;

  public static int calculateCorporationTax(String state, int year, int profit) {
    if (isLeapDay(year)) {
      return (int) Math.ceil(profit * calcStateTax(state));
    }
    return (int) Math.ceil(profit * (federalTax + calcStateTax(state)));
  }

  private static double calcStateTax(String state) {
      double v;
      switch (state) {
          case "AZ":
              v = azTax;
              break;
          case "CA":
              v = caTax;
              break;
          case "TX":
              v = txTax;
              break;
          case "NC":
              v = ncTax;
              break;
          default:
              v = otherTax;
              break;
      }
      return v;
  }

  private static boolean isLeapDay(int year) {
      return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
  }
}
