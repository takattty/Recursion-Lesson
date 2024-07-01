package problem.easy;

public class Hamming {

    public static void main(String[] args) {
        System.out.println(hammingDistanceInString("toned","roses"));
        System.out.println(hammingDistanceInString("toned","toned") );
        System.out.println(hammingDistanceInString("cats","dogs") );
        System.out.println(hammingDistanceInString("dogandcat","catanddog") );
        System.out.println(hammingDistanceInString("AABBCCDD","AAAACCCC") );
    }

    public static int hammingDistanceInString(String string1, String string2){
        int count = 0;

        for (int i = 0; i<string1.length(); i++) {
            if (string1.charAt(i) != (string2.charAt(i))) {
                count++;
            }
        }

        return count;
    }
}
