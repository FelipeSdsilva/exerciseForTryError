package application;

import application.view.AccountViewText;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        String name;
        Integer number;
        Double amount, withdrawLimit;


        System.out.print(AccountViewText.enterAccountData + "\n" + AccountViewText.numberAccount);
        number = sc.nextInt();
        sc.nextLine();

        System.out.print(AccountViewText.holderName);
        name = sc.nextLine();

        System.out.print(AccountViewText.InitialBalance);
        amount = sc.nextDouble();

        System.out.print(AccountViewText.withdrawLimit);
        withdrawLimit = sc.nextDouble();


        sc.close();
    }
}