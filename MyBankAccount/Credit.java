package MyBankAccount;

import Polymorphism.BankAccount.BankAccount;

public class Credit extends BankAccount {
    private double balance;
    public Credit(long accountNumber, String accountHolderName) {
        super(accountNumber, accountHolderName);
        this.balance = 5000;
    }

    @Override
    public double getBalance() {
        return balance;
    }
}
