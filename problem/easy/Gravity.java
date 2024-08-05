package problem.easy;

public class Gravity {
    private static double earthGravity = 9.8;
    private static double jupiterGravity = 24.79;
    private static double mercuryGravity = 3.7;
    private static double otherGravity = 0;

    public static int fallingDistance(String planet, int time) {
        // 関数を完成させてください
        return calcMerteToMile((1 / 2) * calcGravity(planet) * Math.pow(time, 2));
    }

    private static double calcGravity(String planet) {
//    if (planet.equals("Earth")) {
//      return earthGravity;
//    } else if (planet.equals("Jupiter")) {
//      return jupiterGravity;
//    } else if (planet.equals("Mercury")) {
//      return mercuryGravity;
//    } else {
//      return otherGravity;
//    }

        return switch (planet) {
            case "Earch" -> earthGravity;
            case "Jupiter" -> jupiterGravity;
            case "Mercury" -> mercuryGravity;
            default -> otherGravity;
        };
    }

    private static int calcMerteToMile(double heightOfMeter) {
        // private staticなメソッド内でprivate staticな変数は使えない？？
        double converteMeterToMileValue = 0.000621371;

        return (int) Math.floor(heightOfMeter * converteMeterToMileValue);
    }
}
