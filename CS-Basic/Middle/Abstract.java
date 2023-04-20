public class Abstract {
  public static void main(String[] args) {
    int x = 1;
    int y = 3;
    System.out.println(isPerfectSquare(x, y));
  }

  public static boolean isPerfectSquare(int x, int y) {
    double distance = Math.hypot(x, y);
    return distance % 1 != 0;

  }
}