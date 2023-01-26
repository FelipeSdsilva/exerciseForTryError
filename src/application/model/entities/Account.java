package application.model.entities;

import application.model.exceptions.AccountException;
import application.view.AccountViewText;

public class Account {

    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    public Account(Integer number, String holder, Double amount, Double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        deposit(amount);
        this.withdrawLimit = withdrawLimit;
    }

    public void deposit(Double amount) {
        balance += amount;
    }

    public void withdraw(Double amount) {
        try {
            if (amount <= balance && amount <= withdrawLimit) {
                balance -= amount;
            }
        } catch (AccountException e) {
            if (amount > withdrawLimit) {
                System.out.print(AccountViewText.withdrawLimit);
            }
        }

    }
}

