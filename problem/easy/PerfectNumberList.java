package problem.easy;

import java.util.ArrayList;
import java.util.List;

public class PerfectNumberList {

    public static void main(String[] args) {
        System.out.println(perfectNumberList(1));
        System.out.println(perfectNumberList(3));
        System.out.println(perfectNumberList(6));
        System.out.println(perfectNumberList(8));
        System.out.println(perfectNumberList(28));
        System.out.println(perfectNumberList(100));
        System.out.println(perfectNumberList(496));
        System.out.println(perfectNumberList(1000));
        System.out.println(perfectNumberList(10000));
    }

    public static String perfectNumberList(int n){
        List<String> list = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (isPerfectNumber(i)) {
                list.add(String.valueOf(i));
            }
        }

        if (list.isEmpty()) {
            return "none";
        } else {
            return String.join("-", list);
        }
    }

    private static boolean isPerfectNumber(int param) {
        List<Integer> list = new ArrayList<>();

        for (int i=1; i<=param; i++) {
            if (param % i == 0) {
                list.add(i);
            }
        }

        int result = 0;
        int lastNumber = 0;
        for (int i=0; i<list.size(); i++) {
            if (i == list.size() -1) {
                lastNumber = list.get(i);
            } else {
                result = result + list.get(i);
            }
        }

        return result == lastNumber;
    }
}
