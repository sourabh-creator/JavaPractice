package org.example;

public class PrimeNumber {
      public boolean isPrime(int n) {
        if (n <= 1) {
            System.out.println("The given number " + n + " is not a prime number");
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                System.out.println("The given number " + n + " is not a prime number");
                return false;
            }
        }
        System.out.println("The given number " + n + " is prime");
        return true;
    }
        public static void main(String[] args) {
        PrimeNumber primeChecker = new PrimeNumber();
        int number = 29;
        primeChecker.isPrime(number);
    }
}
