package com.kodilla.bankATM;

public class ATM extends Bank {

    public void startTransaction() {
        insertCard();
        enterPIN();
        enterAmount();
        receivePaymentRequest();
        checkAccountBalance();
        acceptPaymentRequest();
        withdrawCash();
        printGoodbay();
    }

    private void insertCard() {
        System.out.println("Please insert card");
    }

    private void enterPIN() {
        System.out.println("Please enter your PIN number");
    }

    private void enterAmount() {
        System.out.println("Please enter amount");
    }

    @Override
    protected void receivePaymentRequest() {
        System.out.println("The payment request was received");
    }

    @Override
    protected void acceptPaymentRequest() {
        System.out.println("The payment request was accepted");
    }

    private void withdrawCash() {
        System.out.println("Cash withdrawal...");
    }

    private void printGoodbay() {
        System.out.println("Thank you for using our services");
    }
}