package org.example.problem.easy;

public class SwapPosition {
  public static void main(String[] args) {
    System.out.println(swapPosition("abcde"));
  }

  public static String swapPosition(String s) {
    if (s.length() == 2) {
      return s.substring(1).concat(s.substring(0, 1));
    }

    if (s.length() % 2 != 0) {
      String lastWord = s.substring(s.length() - 1);
      String originalWord = s.substring(0, s.length() - 1);
      String oddResultWord = swapPosition(originalWord.substring(0, originalWord.length() - 2))
          + originalWord.substring(originalWord.length() - 1)
              .concat(originalWord.substring(originalWord.length() - 2, originalWord.length() - 1));
      return oddResultWord.concat(lastWord);
    }
    return swapPosition(s.substring(0, s.length() - 2))
        + s.substring(s.length() - 1).concat(s.substring(s.length() - 2, s.length() - 1));
  }
}
