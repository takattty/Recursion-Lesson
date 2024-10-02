package problem.easy;

public class Gravity {
    private static final double earthGravity = 9.8;
    private static final double jupiterGravity = 24.79;
    private static final double mercuryGravity = 3.7;
    private static final double otherGravity = 0;

    public static int fallingDistance(String planet, int time) {
        // 関数を完成させてください
        return calcMerteToMile(((double) 1 / 2) * calcGravity(planet) * Math.pow(time, 2));
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
            case "Earth" -> earthGravity;
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
