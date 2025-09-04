package module.BankApp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.nio.file.*;
import java.time.Instant;
import java.util.List;

public class App {
    private static final Logger log = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        try {
            // --- Exceptions &  Logging ---
            var acct = new BankAccount("A-1", 100);
            acct.deposit(50);
            safeWithdraw(acct, 200); // triggers custom checked exception
            acct.withdraw(80);

            // --- File I/O + trying-with-resources ---
            Path path = Path.of("ledger.txt");
            try (BufferedWriter w = Files.newBufferedWriter(path)) {
                w.write("Account balance=" + acct.getBalance() + " at " + Instant.now());
            }
            List<String> lines = Files.readAllLines(path);
            System.out.println("Ledger file: " + lines);

            // --- Streams ---
            var nums = List.of(3, 1, 4, 1, 5);
            var evens = nums.stream().filter(n -> n % 2 == 0).toList();
            System.out.println("Even numbers: " + evens);

            // --- Serialization ---
            var msg = "Hello, World!";
            Path serPath = Path.of("obj.bin");
            try (ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(serPath))) {
                oos.writeObject(msg);
            }
            try (ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(serPath))) {
                System.out.println("Loaded object: " + ois.readObject());
            }

            // --- Generics & var ---
            var bi = new Box<>(123);
            var bn = new Box<Number>(0);
            Box.copy(bi, bn);
            System.out.println("Box after copy: " + bn.get());

        } catch (Exception e) {
            log.error("Error in App: {}", e.getMessage(), e);
        }
    }

    private static void safeWithdraw(BankAccount acct, double amt) {
        try {
            acct.withdraw(amt);
        } catch (InsufficientFundsException e) {
            System.err.println("Withdraw failed: " + e.getMessage());
        }
    }
}
