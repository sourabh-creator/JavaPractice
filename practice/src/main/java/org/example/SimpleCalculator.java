package org.example;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class SimpleCalculator {
    public int add(List<Integer> lst) {
        int sum = 0;
        for (int num : lst) {
            sum += num;
        }
        return sum;
    }
    public int subtract(List<Integer> lst) {
        if (lst.isEmpty()) return 0;
        int result = lst.get(0);
        for (int i = 1; i < lst.size(); i++) {
            result -= lst.get(i);
        }
        return result;
    }

    public int multiply(List<Integer> lst) {
        if (lst.isEmpty()) return 0;
        int product = 1;
        for (int num : lst) {
            product *= num;
        }
        return product;
    }
    public double divide(List<Integer> lst) {
        if (lst.isEmpty()) return 0;
        double result = lst.get(0);
        for (int i = 1; i < lst.size(); i++) {
            int divisor = lst.get(i);
            if (divisor == 0) {
                System.out.println("Division by zero is not allowed");
                return 0;
            }
            result /= divisor;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SimpleCalculator calc = new SimpleCalculator();
        System.out.print("Enter numbers separated by spaces: ");
        String[] inputNumbers = scanner.nextLine().split(" ");
        List<Integer> numbers = new ArrayList<>();
        for (String numStr : inputNumbers) {
            numbers.add(Integer.parseInt(numStr));
        }
        System.out.print("Enter operation (add, sub, mul, div): ");
        String operation = scanner.nextLine();

        switch (operation.toLowerCase()) {
            case "add":
                System.out.println("Result: " + calc.add(numbers));
                break;
            case "sub":
                System.out.println("Result: " + calc.subtract(numbers));
                break;
            case "mul":
                System.out.println("Result: " + calc.multiply(numbers));
                break;
            case "div":
                System.out.println("Result: " + calc.divide(numbers));
                break;
            default:
                System.out.println("Invalid operation");
        }

        scanner.close();
    }
}
