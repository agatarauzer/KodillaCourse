package com.kodilla.bankATM;

public abstract class Bank {
    abstract protected void receivePaymentRequest();

    abstract protected void acceptPaymentRequest();

    protected void checkAccountBalance() {
        System.out.println("Checking balance...");
    }
}
