package problem.easy;

public class CountBetweenNumbers {

    public static void main(String[] args) {
        System.out.println(countBetweenNumbers(1,1,20));
        System.out.println(countBetweenNumbers(5,1,100));
        System.out.println(countBetweenNumbers(3,100,250));
        System.out.println(countBetweenNumbers(3,1,1000));
        System.out.println(countBetweenNumbers(1,1,300));
        System.out.println(countBetweenNumbers(9,899,1000));
    }

    public static int countBetweenNumbers(int digit, int idStart, int idEnd){
        int count = 0;

        for (int i = idStart; i<=idEnd; i++) {
            var str = String.valueOf(i);
            for (var cha : str.toCharArray()) {
                if (cha == String.valueOf(digit).charAt(0)) {
                    count++;
                }
            }
        }

        return count;
    }
}
