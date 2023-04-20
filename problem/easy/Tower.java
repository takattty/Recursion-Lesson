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
    if (planet.equals("Earth")) {
      return 9.8;
    } else if (planet.equals("Jupiter")) {
      return 24.79;
    } else if (planet.equals("Mars")) {
      return 3.71;
    } else if (planet.equals("Pluto")) {
      return 0.58;
    } else if (planet.equals("Moon")) {
      return 1.62;
    } else {
      return 0;
    }
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
