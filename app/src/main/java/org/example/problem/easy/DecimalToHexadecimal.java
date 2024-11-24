package org.example.problem.easy;

public class DecimalToHexadecimal {

    public static void main(String[] args) {
        System.out.println(decimalToHexadecimal(532454));
        System.out.println(decimalToHexadecimal(90304));
        System.out.println(decimalToHexadecimal(28394));
        System.out.println(decimalToHexadecimal(15));
        System.out.println(decimalToHexadecimal(74));
    }

    public static String decimalToHexadecimal(int decNumber){
        return Integer.toHexString(decNumber).toUpperCase();
    }
}
