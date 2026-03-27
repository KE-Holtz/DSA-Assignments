package Q3;

public abstract class BankAccount {
    private double balance;

    public BankAccount() {
        balance = 0;
    }

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

    public void transfer(double amount, BankAccount other) {
        this.withdraw(amount);
        other.deposit(amount);
    }
}