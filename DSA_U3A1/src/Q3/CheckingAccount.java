package Q3;

public class CheckingAccount extends BankAccount {
    private int transactionCount = 0;
    private static final int FREE_TRANSACTIONS = 3;
    private static final double TRANSACTION_FEE = 2.0;

    public CheckingAccount(double initialBalance) {
        super(initialBalance);
    }

    // Transaction count increases every deposit
    public void deposit(double amount) {
        transactionCount++;
        super.deposit(amount);
    }

    // Transaction count increases every withdrawl
    public void withdraw(double amount) {
        transactionCount++;
        super.withdraw(amount);
    }

    // When transactionCount exceeds the number of free transactions
    // the transaction fee must be deducted from the account and
    // transaction count is reset to 0.
    public void deductFees() {
        if (transactionCount > FREE_TRANSACTIONS) {
            withdraw(TRANSACTION_FEE);
            transactionCount = 0;
        }

        //TODO: Does six transactions remove 2x transaction fee?
    }
}