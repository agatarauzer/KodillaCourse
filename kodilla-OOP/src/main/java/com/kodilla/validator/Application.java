package com.kodilla.validator;

public class Application {
    public static void main(String[] args) {
        String name = "Adam";
        double age = 40.5;
        double height = 178;
        UserValidator validator = new UserValidator();
        if (validator.validateName(name)) {
            validator.validateAgeAndHeight(age, height);
        }
    }
}
