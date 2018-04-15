package com.kodilla.ATMsimulator;

public interface ATM {
    void depositCash(double amount);
    void withdrawCash(double amount);

    default void connectWithBank() {
        System.out.println("ATM is connected with bank...");
    }

    static void endWorks() {
        System.out.println("Goodbay!");
    }
}
