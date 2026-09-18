package com.simon;

import java.util.Scanner;

public class Main {

    static Scanner scanner;

    void main() {

        Bank bank = new Bank();

        scanner = new Scanner(System.in);

        while(true) {
            IO.print("1. Check balance  2. Deposit  3. Withdraw 4. Print Statement History 5. Exit: ");

            int input = scanner.nextInt();

            switch (input) {
                case 1 -> CheckBalance(bank);
                case 2 -> Deposit(bank);
                case 3 -> Withdraw(bank);
                case 4 -> StateMentHistory(bank);
                case 5 -> {return;}
            }
        }
    }

    public static void CheckBalance(Bank bank) {
        IO.println("Balance: " + bank.getBalance());
    }

    public static void Deposit(Bank bank) {
        IO.print("\nEnter amount to deposit: ");
        double amount = scanner.nextDouble();
        bank.deposit(amount);
    }

    public static void Withdraw(Bank bank) {
        IO.print("\nEnter amount to withdraw: ");
        double amount = scanner.nextDouble();
        bank.withdraw(amount);
    }

    public static void StateMentHistory(Bank bank) {
        bank.printStatementHistory();
    }
}
