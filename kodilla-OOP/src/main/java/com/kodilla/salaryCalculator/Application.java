package com.kodilla.salaryCalculator;

public class Application {
    public static void main(String args[]) {
        Employee productsSalaryEmployee = new ProductsSalaryEmployee(100);
        Employee bonusSalaryEmployee = new BonusSalaryEmployee(true);

        SalaryPayoutProcessor processor = new SalaryPayoutProcessor(productsSalaryEmployee);
        processor.processPayout();
        processor.changeEmployee(bonusSalaryEmployee);
        processor.processPayout();
    }
}
