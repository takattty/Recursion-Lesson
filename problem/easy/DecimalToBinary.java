package problem.easy;

public class DecimalToBinary {

    public static void main(String[] args) {
        System.out.println(decimalToBinary(60));
        System.out.println(decimalToBinary(26));
        System.out.println(decimalToBinary(35));
        System.out.println(decimalToBinary(100));
        System.out.println(decimalToBinary(505));
    }

    public static String decimalToBinary(int decNumber){
        return Integer.toHexString(decNumber).toUpperCase();
    }
}
