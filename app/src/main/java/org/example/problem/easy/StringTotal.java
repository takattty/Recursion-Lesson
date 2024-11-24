package org.example.problem.easy;

public class StringTotal {
  public static void main(String[] args) {
    System.out.println(mergeString("ab", "cd"));
  }

  public static String mergeString(String s1, String s2) {
    if (s1.length() == 1 && s2.length() == 1) {
      return s1.concat(s2);
    }
    return mergeString(s1.substring(0, s1.length() - 1), s2.substring(0, s2.length() - 1))
        + s1.substring(s1.length() - 1).concat(s2.substring(s2.length() - 1));
  }
}
