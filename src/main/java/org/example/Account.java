package org.example;

public class Account {
    private double balance;

    public Account(double initialBalance) {
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            this.balance = 0;
            System.out.println("Balance can not be negative! Resetting to zero!");
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount + "€");
        } else {
            System.out.println("Balance must be greater than zero!");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount + "€");
        } else if (amount > balance) {
            System.out.println("Not enough balance for this withdrawal!");
        } else {
            System.out.println("Balance must be Positive!");
        }
    }

    public double checkBalance() {
        return balance;
    }

    public void transfer(Account recipient, double amount) {
        if (amount > 0 && amount <= balance) {
            this.withdraw(amount);
            recipient.deposit(amount);
            System.out.println("Transfer of " + amount + "€ was sucessful!");
        } else if (amount > balance) {
            System.out.println("Not enough Balance to transfer!");
        } else {
            System.out.println("Balance must be Positive!");
        }
    }
}

