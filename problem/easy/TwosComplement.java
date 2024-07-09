package problem.easy;

public class TwosComplement {

    public static void main(String[] args) {
        System.out.println(twosComplement("00011100"));
//        System.out.println(twosComplement("00000000"));
//        System.out.println(twosComplement("00000010"));
//        System.out.println(twosComplement("11111111"));
//        System.out.println(twosComplement("01110101"));
//        System.out.println(twosComplement("00000001"));
//        System.out.println(twosComplement("10000000"));
//        System.out.println(twosComplement("10101010"));
//        System.out.println(twosComplement("11111110"));
    }

    public static String twosComplement(String bits){
        var oneComplementString = oneComplement(bits);
        System.out.println(Integer.parseInt(oneComplementString));
        return "";
    }

    private static String oneComplement(String bits) {
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
