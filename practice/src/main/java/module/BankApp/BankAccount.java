package module.BankApp;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BankAccount {
    private static final Logger log = LoggerFactory.getLogger(BankAccount.class);

    private final String id;
    private double balance;

    public BankAccount(String id, double initial) {
        this.id = id;
        if (initial < 0) throw new IllegalArgumentException("Initial balance must be >= 0");
        this.balance = initial;
        log.info("Opened account {} with balance {}", id, initial);
    }

    public void deposit(double amt) {
        if (amt <= 0) throw new IllegalArgumentException("Deposit must be > 0");
        balance += amt;
        log.debug("deposit {} amount={} newBalance={}", id, amt, balance);
    }

    public void withdraw(double amt) throws InsufficientFundsException {
        if (amt <= 0) throw new IllegalArgumentException("Withdraw must be > 0");
        if (balance < amt) {
            log.warn("insufficient funds id={} balance={} amt={}", id, balance, amt);
            throw new InsufficientFundsException("Need " + (amt - balance) + " more");
        }
        balance -= amt;
        log.info("withdraw {} amount={} newBalance={}", id, amt, balance);
    }

    public double getBalance() { return balance; }
}
