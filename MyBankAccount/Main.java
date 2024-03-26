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
        Saving saving = new Saving(7843748, 0);

        BankAccount account = new BankAccount(883882989);
        account.transferFunds(checking,saving,17400);

        System.out.println("New checking balance: " +checking.getBalance());
        System.out.println("New Saving balance: " + saving.getBalance());

    }
}
