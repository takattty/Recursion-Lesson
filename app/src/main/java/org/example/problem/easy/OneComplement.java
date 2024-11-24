package org.example.problem.easy;

public class OneComplement {

    public static void main(String[] args) {
        System.out.println(oneComplement("00011100"));
        System.out.println(oneComplement("10010"));
        System.out.println(oneComplement("001001"));
        System.out.println(oneComplement("0111010"));
        System.out.println(oneComplement("1"));
    }

    public static String oneComplement(String bits){
        StringBuilder sb = new StringBuilder();

        for (var s : bits.toCharArray()) {
            if (s == '0') {
                sb.append('1');
            } else {
                sb.append('0');
            }
        }

        return sb.toString();
    }
}
