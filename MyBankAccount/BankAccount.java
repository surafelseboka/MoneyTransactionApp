package MyBankAccount;

public class BankAccount {
    private double balance;
    private long accountNumber;

    public BankAccount(long accountNumber) {
        this.accountNumber = accountNumber;
    }
    public void deposit(double amount){
        balance += amount;
    }
    public boolean withdraw(double amount){
        if (balance > amount){
            balance -= amount;
            return true;
            } else {
            System.out.println("Don't have enough money ");
            return false;
        }
    }
        public double getBalance(){

        return balance;
    }


    public void transferFunds(Checking checking, Saving saving, double amount){
        if (checking.withdraw(amount)){
            saving.deposit(amount);
             System.out.println("Successfully transferred $" + amount + " from " +
                    checking.getClass().getSimpleName() + " to " +
                    saving.getClass().getSimpleName());
        }
    }

}
