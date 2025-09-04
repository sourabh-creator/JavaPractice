package module.BankApp;

/**
 * Custom checked exception.*/
public class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}
