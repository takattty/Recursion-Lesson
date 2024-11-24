package org.example.problem.easy;

public class IsPangram {
    public static void main(String[] args) {
//        System.out.println(isPangram("we promptly judged antique ivory buckles for the next prize"));
        System.out.println(isPangram("the Japanese yen for commerce is still well-known"));
    }

    public static boolean isPangram(String string){
        boolean[] alphabet = new boolean[26];

        for(char c : string.toLowerCase().toCharArray()) {
            if (c - 97 >= 0 && c - 97 <= 26) {
                alphabet[c - 97] = true;
            }
        }

        for (boolean e : alphabet) {
            if (!e) {
                return false;
            }
        }

        return true;
    }
}
