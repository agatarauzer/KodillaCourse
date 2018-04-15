package com.kodilla.salaryCalculator;

public abstract class SalaryPayout {
    private Employee employee;

    public SalaryPayout(Employee employee) {
        this.employee = employee;
    }

    protected abstract void payout();

    public void processPayout() {
        employee.printEmployeeSalaryInfo();
        System.out.println("Creating payout for: " + employee.calculateSalary() + " PLN");
        payout();
        System.out.println("Payout has been completed!\n");
    }

    public void changeEmployee(Employee employeeType) {
        employee = employeeType;
    }
}
