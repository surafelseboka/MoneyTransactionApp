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
    public void deposit(int amount) {
        balance += amount;
    }

    public double applyOverDraftFee(double amount){
        double overDraft = amount - balance - overdraft_limit;
        if (overDraft > 0){
            double fee = overDraft * 0.15;
            balance -= fee;
        } else{
            balance = overDraft;
        }
        return balance;
    }

    @Override
    public void withdraw(int amount) {
        if (amount > balance) {
            balance = applyOverDraftFee(amount);
        } else {
            balance -= amount;
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }
}
