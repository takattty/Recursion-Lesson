package org.example.problem.easy;

public class Tower {
  public static void main(String[] args) {
    System.out.println(Tower.getEmotion(88, "Earth"));
  }

  public static String getEmotion(int height, String planet) {
    if (calcGravity(planet) == 0)
      return "no data";

    double speed = Math.sqrt(2 * calcGravity(planet) * height);
    return fearLevel(speed);
  }

  private static double calcGravity(String planet) {
      double v;
      switch (planet) {
          case "Earth":
              v = 9.8;
              break;
          case "Jupiter":
              v = 24.79;
              break;
          case "Mars":
              v = 3.71;
              break;
          case "Pluto":
              v = 0.58;
              break;
          case "Moon":
              v = 1.62;
              break;
          default:
              v = 0;
              break;
      }
      return v;
  }

  private static String fearLevel(double speed) {
    if (speed >= 80) {
      return "terrified";
    } else if (speed >= 60) {
      return "frighten";
    } else if (speed >= 40) {
      return "scared";
    } else {
      return "afraid";
    }
  }
}
