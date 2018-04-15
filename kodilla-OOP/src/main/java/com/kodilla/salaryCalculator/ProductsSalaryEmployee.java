package com.kodilla.salaryCalculator;

public class ProductsSalaryEmployee implements Employee {
    private int products;
    private final double salaryForProduct = 5.0;

    public ProductsSalaryEmployee(int products) {
        this.products = products;
    }

    public double calculateSalary() {
        return products * salaryForProduct;
    }

    public void printEmployeeSalaryInfo() {
        System.out.println("EMPLOYEE SALARY TYPE: products sale.\nProducts sold: " + products + ", salary for one product: " + salaryForProduct + " PLN.");
    }
}
