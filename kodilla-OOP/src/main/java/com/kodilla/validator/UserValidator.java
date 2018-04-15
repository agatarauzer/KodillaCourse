package com.kodilla.validator;

public class UserValidator {
    private static final int MIN_AGE = 30;
    private static final int MIN_HEIGHT = 160;

    public boolean validateName(String name) {
        return name != null;
    }

    public void validateAgeAndHeight(double age, double height) {
        if (validateAge(age) && validateHeight(height))
            System.out.println("User is older than " + MIN_AGE + " and higher than " + MIN_HEIGHT + "cm");
        else
            System.out.println("User is younger than " + MIN_AGE + " or lower than " + MIN_HEIGHT + "cm");
    }

    private boolean validateAge(double age) {
        return age > MIN_AGE;
    }

    private boolean validateHeight(double height) {
        return height > MIN_HEIGHT;
    }
}
