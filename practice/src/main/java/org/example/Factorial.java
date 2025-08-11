package org.example;
public class Factorial {
    private int i;
    private int result = 1;
    private int n;
    public int factorial(int n) {
        if (n == 0 || n == 1) {
            result = 1;
        } else {
            for (i = 2; i <= n; i++) {
                result *= i;
            }
        }
        return result;
    }
       public static void main(String[] args) {
        Factorial calculator = new Factorial();
        int number = 5;
        int fact = calculator.factorial(number);
        System.out.println("Factorial of " + number + " is: " + fact);
    }
}
