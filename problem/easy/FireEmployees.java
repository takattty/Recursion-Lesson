package problem.easy;

import java.util.Arrays;

public class FireEmployees {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(fireEmployees(new String[]{"Steve", "David", "Mike", "Donald", "Lake", "Julian"}, new String[]{"Donald", "Lake"})));
    }

    public static Object[] fireEmployees(String[] employees, String[] unemployed){
        if (unemployed.length == 0) return employees;

//        List<String> employeesArray = new ArrayList<>(List.of(employees));
//        employeesArray.removeAll(List.of(unemployed));
//
//        return employeesArray.toArray(new String[]{});

        // リファクタ後
        return Arrays.stream(employees)
                .filter(employee -> !Arrays.asList(unemployed).contains(employee))
                .toArray(String[]::new);

        // toArray(size -> new String[size]);
    }
}
