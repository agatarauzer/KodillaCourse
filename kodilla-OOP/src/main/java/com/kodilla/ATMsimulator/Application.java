package com.kodilla.ATMsimulator;

public class Application {
    public static void main (String[] args) {
        ATMImplementation atm = new ATMImplementation(2500.0);

        atm.connectWithBank();
        System.out.println("Actual balance:" + atm.getBalance());
        atm.depositCash(500.0);
        System.out.println("Actual balance:" + atm.getBalance());
        atm.withdrawCash(3000.0);
        System.out.println("Actual balance:" + atm.getBalance());
        atm.withdrawCash(200.0);
        ATM.endWorks();
    }
}
