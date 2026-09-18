package com.simon;

public class Bank {

    private double balance = 0;

    public Bank() {
    }

    public void deposit(double amount) {
        IO.print("Deposit: " + amount + " ");
        this.balance += amount;
        IO.println("New balance is: " + this.balance);
    }
}
