package MyBankAccount;

public class BankAccount {
    private double balance;
    private long accountNumber;

    public BankAccount(long accountNumber) {
        this.accountNumber = accountNumber;
    }
    public void deposit(int amount){
        balance += amount;
    }
    public void withdraw(int amount){
        if (amount > balance){
            System.out.println("Don't have enough money ");
        } else  balance -= amount;
    }
        public double getBalance(){

        return balance;
    }

}
