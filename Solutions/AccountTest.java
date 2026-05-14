class Account {
    private double balance;

    public Account(double initialBalance) {
        if (initialBalance > 0.0) this.balance = initialBalance;
    }

    public void debit(double amount) {
        if (amount > balance) {
            System.out.println("Debit amount exceeded account balance.");
        } else {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        }
    }

    public double getBalance() {
        return balance;
    }
}

public class AccountTest {
    public static void main(String[] args) {
        Account myAccount = new Account(500.00);
        System.out.println("Initial Balance: " + myAccount.getBalance());

        myAccount.debit(150.0);
        System.out.println("Remaining Balance: " + myAccount.getBalance());

        myAccount.debit(600.0);
    }
}