package org.example.problem.easy;

public class TwosComplement {

    public static void main(String[] args) {
        System.out.println(twosComplement("00011100"));
        System.out.println(twosComplement("00000000"));
        System.out.println(twosComplement("00000010"));
        System.out.println(twosComplement("11111111"));
        System.out.println(twosComplement("01110101"));
        System.out.println(twosComplement("00000001"));
        System.out.println(twosComplement("10000000"));
        System.out.println(twosComplement("10101010"));
        System.out.println(twosComplement("11111110"));
    }

    public static String twosComplement(String bits){

        if (bits.equals("00000000")) return "100000000";

        var oneComplementString = oneComplement(bits).reverse();
        var result = new StringBuilder();
        boolean flag = true;

        for (var sb : oneComplementString.toString().toCharArray()) {
            if (sb == '0') {
                if (flag) {
                    result.append("1");
                    flag = false;
                } else {
                    result.append("0");
                }
            } else {
                if (flag) {
                    result.append("0");
                } else {
                    result.append("1");
                }
            }
        }

        return result.reverse().toString();
    }

    private static StringBuilder oneComplement(String bits) {
        StringBuilder sb = new StringBuilder();

        for (var s : bits.toCharArray()) {
            if (s == '0') {
                sb.append('1');
            } else {
                sb.append('0');
            }
        }

        return sb;
    }
}
