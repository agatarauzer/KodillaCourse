package com.kodilla.ATMsimulator;

public class ATMImplementation implements ATM{
    private double balance;

    public ATMImplementation(double balance) {
        this.balance = balance;
    }

    public void depositCash(double amount) {
        System.out.println("Deposit cash: " + amount);
        balance += amount;
    }

    public void withdrawCash(double amount) {
        System.out.println("Withdraw cash: " + amount);

        if (balance - amount >= 0) {
            balance -= amount;
            System.out.println("Succeded!");
        }
        else {
            System.out.println("You do not have enough cash on account!");
        }
    }

    public double getBalance() {
        return balance;
    }
}
