package MyBankAccount;

public class Checking extends BankAccount {

    private double balance;
    private double overdraft_limit;

    public double getOverdraft_limit() {
        return overdraft_limit;
    }

    public Checking(long accountNumber, double overdraft_limit ) {
        super(accountNumber);
        this.balance = 15000;
        this.overdraft_limit = overdraft_limit;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    public double applyOverDraftFee(double amount){
        double overDraft = amount - balance - overdraft_limit;
        if (overDraft > 0){
            double fee = overDraft * 0.15;
            balance = fee * -1;
        } else{
            balance = overDraft;
        }
        return balance;
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
