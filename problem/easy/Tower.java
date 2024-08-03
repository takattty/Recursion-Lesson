package problem.easy;

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
      return switch (planet) {
          case "Earth" -> 9.8;
          case "Jupiter" -> 24.79;
          case "Mars" -> 3.71;
          case "Pluto" -> 0.58;
          case "Moon" -> 1.62;
          default -> 0;
      };
  }

  private static String fearLevel(double speed) {
    if (speed >= 80) {
      return "terrified";
    } else if (speed >= 60 && speed < 80) {
      return "frighten";
    } else if (speed >= 40 && speed < 60) {
      return "scared";
    } else {
      return "afraid";
    }
  }
}
