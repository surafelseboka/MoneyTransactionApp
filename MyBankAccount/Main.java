package MyBankAccount;

import javax.security.sasl.SaslClient;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please Enter from which account a balance want transfer from: " + "\n" +  "(Checking or Saving : ");
        String accountType = scanner.nextLine();
        System.out.print("How much you want transfer: ");
        double amount = scanner.nextDouble();
        account.transferFunds(checking,saving,amount, accountType);

        System.out.println("New checking balance: " +checking.getBalance());
        System.out.println("New Saving balance: " + saving.getBalance());

    }
}
