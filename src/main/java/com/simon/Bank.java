package com.simon;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    private double balance = 0;
    private List<String> statementHistory = new ArrayList<>();

    public Bank() {
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        IO.print("Deposit: " + amount + " ");
        this.balance += amount;
        IO.println("New balance is: " + this.balance);
        this.statementHistory.add("Deposit: " + amount + " balance: " + this.balance);
    }

    public void withdraw(double amount) {
        IO.print("Withdraw: " + amount + " ");
        this.balance -= amount;
        IO.println("New balance is: " + this.balance);
        this.statementHistory.add("Withdraw: " + amount + " balance: " + this.balance);
    }

    public void printStatementHistory() {
        for(String statement: this.statementHistory) {
            IO.println(statement);
        }
    }
}
