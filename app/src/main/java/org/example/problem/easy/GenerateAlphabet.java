package org.example.problem.easy;

public class GenerateAlphabet {
    public static void main(String[] args) {
        System.out.println(generateAlphabet('n','R'));
//        System.out.println(generateAlphabet('b','b'));
//        System.out.println(generateAlphabet('C','Z'));
    }

    public static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";

    public static char[] generateAlphabet(char firstAlphabet, char secondAlphabet){
        String fl = Character.toString(firstAlphabet).toLowerCase();
        String el = Character.toString(secondAlphabet).toLowerCase();

        String firstLowerAlphabet = ALPHABET.indexOf(fl) <= ALPHABET.indexOf(el) ? fl : el;
        String secondLowerAlphabet = ALPHABET.indexOf(fl) <= ALPHABET.indexOf(el) ? el : fl;

        int firstIndex = ALPHABET.indexOf(firstLowerAlphabet);
        int secondIndex = ALPHABET.indexOf(secondLowerAlphabet);

        StringBuilder sb = new StringBuilder();
        for (var e : ALPHABET.substring(firstIndex, secondIndex+1).toCharArray()) {
            sb.append(e);
        }

        return sb.toString().toCharArray();
    }
}
