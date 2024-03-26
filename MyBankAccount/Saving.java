package MyBankAccount;

public class Saving extends BankAccount {
    private double balance;
    private double overdraft_limit;

    public Saving(long accountNumber, double overdraft_limit) {
        super(accountNumber);
        this.overdraft_limit = overdraft_limit;
        this.balance = 25000;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public boolean withdraw(double amount){
        if (amount > balance + overdraft_limit){
            System.out.println("Insufficient funds for withdrawal, including overdraft.");
            return false;
        }

        //Apply overdraft if needed
        if (amount > balance){
            double overDraftNeeded = amount - balance;
            balance -= amount; // Balance now goes to negative
            System.out.println("Overdraft used. New balance: " + balance);
        } else{
            balance -= amount;
        }
        return true;
    }

    @Override
    public double getBalance() {
        return balance;
    }
}
