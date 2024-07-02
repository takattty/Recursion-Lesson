package problem.easy;

public class CountBetweenNumbers {

    public static void main(String[] args) {
//        System.out.println(countBetweenNumbers(1, 1, 20));
//        System.out.println(countBetweenNumbers(5, 1, 100));
//        System.out.println(countBetweenNumbers(3, 100, 250));
//        System.out.println(countBetweenNumbers(3, 1, 1000));
//        System.out.println(countBetweenNumbers(1, 1, 300));
//        System.out.println(countBetweenNumbers(9, 899, 1000));

//        System.out.println(countBetweenNumbersRef(1, 1, 20));
//        System.out.println(countBetweenNumbersRef(5, 1, 100));
//        System.out.println(countBetweenNumbersRef(3, 100, 250));
//        System.out.println(countBetweenNumbersRef(3, 1, 1000));
//        System.out.println(countBetweenNumbersRef(1, 1, 300));
//        System.out.println(countBetweenNumbersRef(9, 899, 1000));

        System.out.println(countBetweenNumbersRefs(1, 1, 20));
        System.out.println(countBetweenNumbersRefs(5, 1, 100));
        System.out.println(countBetweenNumbersRefs(3, 100, 250));
        System.out.println(countBetweenNumbersRefs(3, 1, 1000));
        System.out.println(countBetweenNumbersRefs(1, 1, 300));
        System.out.println(countBetweenNumbersRefs(9, 899, 1000));
    }

    public static int countBetweenNumbers(int digit, int idStart, int idEnd) {
        int count = 0;

        for (int i = idStart; i <= idEnd; i++) {
            var str = String.valueOf(i);
            for (var cha : str.toCharArray()) {
                if (cha == String.valueOf(digit).charAt(0)) {
                    count++;
                }
            }
        }

        return count;
    }

    public static int countBetweenNumbersRef(int digit, int idStart, int idEnd) {
        int count = 0;

        for (int i = idStart; i <= idEnd; i++) {
            count += countDigitOccurrences(i, digit);
        }

        return count;
    }

    private static int countDigitOccurrences(int number, int digit) {
        return (int) String.valueOf(number)
                .chars()
                .filter(ch -> ch == Character.forDigit(digit, 10))
                .count();
    }

    public static int countBetweenNumbersRefs(int digit, int idStart, int idEnd) {
        int count = 0;

        for (int i = idStart; i <= idEnd; i++) {
            int num = i;
            while (num > 0) {
                if (num % 10 == digit) { // 1桁目を見ている
                    count++;
                }
                num /= 10; // 1桁目以降に移動
            }
        }

        return count;
    }
}
