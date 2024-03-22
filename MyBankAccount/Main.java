package MyBankAccount;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<BankAccount> accounts = new ArrayList<>();
        accounts.add(new Checking(1234567,5));
        accounts.add(new Saving(7654321,500));

        for (BankAccount account : accounts){
            System.out.println("******* Account Type: " + account.getClass().getSimpleName() + " ********");

            System.out.println("Balance: $" + account.getBalance()  + "\n");
        }

        Checking checking = new Checking(89980893,500);
        checking.deposit(0);
        checking.withdraw(17000);
        System.out.println("New checking balance: " +checking.getBalance());

        Saving saving = new Saving(7843748, 1000);
        saving.deposit(3000);
        saving.withdraw(25000);
        saving.withdraw(5000);
        System.out.println("New Saving balance: " + saving.getBalance());
    }
}
