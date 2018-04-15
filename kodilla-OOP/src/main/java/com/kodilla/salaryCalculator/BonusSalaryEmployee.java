package com.kodilla.salaryCalculator;

public class BonusSalaryEmployee implements Employee {
    private final double fixedSalary = 2000;
    private final double bonusRate = 0.2;
    private boolean hasBonus;

    public BonusSalaryEmployee(boolean hasBonus) {
        this.hasBonus = hasBonus;
    }

    public double calculateSalary() {
        if (!hasBonus) {
            return fixedSalary;
        }
        else {
            return fixedSalary + (fixedSalary * bonusRate);
        }
    }

    public void printEmployeeSalaryInfo() {
        System.out.println("EMPLOYEE SALARY TYPE: fixed salary with bonus.\nFixed salary: " + fixedSalary + " PLN.");

        if (hasBonus) {
            System.out.println("Bonus amount: " + fixedSalary * bonusRate + " PLN.");
        }
        else {
            System.out.println("No bonus.");
        }
    }
}
