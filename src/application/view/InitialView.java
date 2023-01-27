package application.view;

import application.model.entities.Account;
import application.model.exceptions.AccountException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InitialView {

    public static void startProgram() {

        Scanner sc = new Scanner(System.in);
        String name;
        int number;
        double amount, withdrawLimit;

        try {
            System.out.print(AccountViewText.enterAccountData + "\n" + AccountViewText.numberAccount);
            number = sc.nextInt();
            sc.nextLine();

            System.out.print(AccountViewText.holderName);
            name = sc.nextLine();

            System.out.print(AccountViewText.InitialBalance);
            amount = sc.nextDouble();

            System.out.print(AccountViewText.withdrawLimit);
            withdrawLimit = sc.nextDouble();

            Account acc = new Account(number, name, amount, withdrawLimit);

            System.out.print(AccountViewText.enterValueForWithdraw);
            amount = sc.nextDouble();

            acc.withdraw(amount);

            System.out.println(acc);

        } catch (AccountException e) {
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Input error");
        }

        sc.close();
    }
}
