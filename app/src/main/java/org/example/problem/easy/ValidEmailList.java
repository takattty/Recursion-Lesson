package org.example.problem.easy;

import java.util.Arrays;

public class ValidEmailList {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(validEmailList(new String[]{"ccc@aaa.com", "c@cc@aaa.com", "cc c@aaa.com", "cc.c@aaa.com"})));
//        System.out.println(Arrays.toString(validEmailList(new String[]{"ccc@aaa.com"})));
    }

    public static String[] validEmailList(String[] emailList){
        return validatedList(emailList);
    }

    private static String[] validatedList(String[] emailList) {
        StringBuilder sb = new StringBuilder();
        for (String email : emailList) {
            if(isCorrectFormat(email)) {
                sb.append(email).append(",");
            }
        }

        return sb.toString().split(",");
    }

    // 正しいフォーマットであればtrue
    private static boolean isCorrectFormat(String email) {
        return hasNotSpace(email) && hasOnlyAtMark(email) && setOfAtMarkAndPeriod(email) && isNotStartAtMark(email);
    }

    // スペースが含まれていない場合はtrue
    private static boolean hasNotSpace(String input) {
        return !input.contains(" ");
    }

    // @を1つだけ含んでいる場合はtrue
    private static boolean hasOnlyAtMark(String input) {
        return input.chars().filter(x -> x == '@').count() == 1;
    }

    // @の後ろに.がある場合はtrue
    private static boolean setOfAtMarkAndPeriod(String input) {
        return input.substring(input.indexOf("@")).contains(".");
    }

    // @から始まっていない場合はtrue
    private static boolean isNotStartAtMark(String input) {
        return !input.startsWith("@");
    }
}
