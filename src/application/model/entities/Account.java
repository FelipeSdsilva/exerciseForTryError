package application.model.entities;

import application.model.exceptions.AccountException;
import application.view.AccountViewText;

public class Account {

    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public void deposit(Double amount) {
        balance += amount;
    }

    public void withdraw(Double amount) {
        if (amount <= balance && amount <= withdrawLimit) {
            balance -= amount;
        }
        if (amount > withdrawLimit) {
            throw new AccountException(AccountViewText.errorWithdraw + AccountViewText.exceedsWithdrawLimitError);
        }
        if (amount > balance) {
            throw new AccountException(AccountViewText.errorWithdraw + AccountViewText.notEnoughBalanceError);
        }
    }

    @Override
    public String toString() {
        return "New balance: " + String.format("%.2f", balance);
    }
}

