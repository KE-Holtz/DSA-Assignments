package Q3;

public class SavingsAccount extends BankAccount {
    private double interestRate; // stored as a percentage (i.e 6% or 7%)
    public static final double MINIMUM_BALANCE = 10;

    public SavingsAccount(double rate) {
        super();
        this.interestRate = rate;
    }

    public SavingsAccount(double initialBalance, double rate) {
        super(initialBalance);
        this.interestRate = rate;
    }

    // Adds the interest earned to the current balance
    public void addInterest() {
        deposit(getBalance() * interestRate/100);
    }

    // Only withdraw the amount if it is larger than the minimum balance
    public void withdraw(double amount) {
        if (getBalance() - amount >= MINIMUM_BALANCE) {
           super.withdraw(amount); 
        }
    }
}
