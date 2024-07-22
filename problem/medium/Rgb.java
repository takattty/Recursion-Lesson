package problem.medium;

import java.util.Map;

public class Rgb {
    public int red;
    public int green;
    public int blue;

    Rgb(int red, int green, int blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    public String getHexCode() {
        return getHexCodePrefix() + getHex();
    }

    public String getHex() {
        return String.format("%02X%02X%02X", red, green, blue).toLowerCase();
    }

    private String getHexCodePrefix() {
        return "#";
    }

    public String getBits() {
        return Integer.toBinaryString(Integer.parseInt(getHex(), 16));
    }

    public String getColorShade() {
        if (red == green && green == blue) return "grayscale";

        var map = Map.of("red", red, "green", green, "blue", blue);
        int biggestNumber = map.values().stream().reduce((first, second) -> first > second ? first : second).get();
        String result = "";

        for (var es : map.entrySet()) {
            if (biggestNumber == es.getValue()) {
                result = es.getKey();
            }
        }

        return result;
    }
}
