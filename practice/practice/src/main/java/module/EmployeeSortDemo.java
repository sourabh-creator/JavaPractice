package module;

import java.util.*;

public class EmployeeSortDemo {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>(List.of(
                new Employee("Alex", 900_000),
                new Employee("Alex", 100_000),
                new Employee("Brian", 95_000)
        ));
        Collections.sort(list);
        list.sort(Comparator.comparing(Employee::name));
        list.forEach(System.out::println);
    }
}

