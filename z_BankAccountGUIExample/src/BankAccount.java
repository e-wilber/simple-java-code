
public class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) {
        double newBalance = this.getBalance() - amount;
        this.setBalance(newBalance);
    }

    public void deposit(double amount) {
        double newBalance = this.getBalance() + amount;
        this.setBalance(newBalance);
    }
}
