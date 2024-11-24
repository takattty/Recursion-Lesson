package org.example.problem.medium;

import java.util.Map;

public class Rgb {
    public final int red;
    public final int green;
    public final int blue;

    Rgb(int red, int green, int blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    public String getHexCode() {
        return "#" + getHex();
    }

    public String getHex() {
        return String.format("%02X%02X%02X", red, green, blue).toLowerCase();
    }

    public String getBits() {
        return Integer.toBinaryString(Integer.parseInt(getHex(), 16));
    }

    public String getColorShade() {
        if (red == green && green == blue) return "grayscale";

//        int biggestNumber = map.values().stream().reduce((first, second) -> first > second ? first : second).get();
//        String result = "";
//        for (var es : map.entrySet()) {
//            if (biggestNumber == es.getValue()) {
//                result = es.getKey();
//            }
//        }

        // リファクタ後
        Map<String, Integer> colorMap = Map.of("red", red, "green", green, "blue", blue);
        return colorMap.entrySet().stream()
                .max(Map.Entry.comparingByValue()) // Map.Entry.comparingByValue()はentrySetのvalueを見て処理を行う
                // でmaxのkey:valueを選択し↓に繋げる
                .map(Map.Entry::getKey)
//                .map(x -> x.getKey()) // ラムダ式の方。上の処理はメソッド参照だけど、どうして上記の書き方かいまいちわかっていない
                // めちゃ簡単で、getKey()がMap.Entryインターフェースで定義されているメソッドだから
                .orElse("");
    }
}
