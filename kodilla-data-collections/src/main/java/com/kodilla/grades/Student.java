package com.kodilla.grades;

import java.util.Objects;

public class Student {
    private String firstName;
    private String lastName;
    private String pesel;

    public Student(String firstName, String lastName, String pesel) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pesel = pesel;
    }

    public boolean equals(Object otherObject) {
        if (otherObject == null) {
            return false;
        }
        if (this == otherObject) {
            return true;
        }

        if (!(otherObject instanceof Student)) {
            return false;
        }

        Student other = (Student)otherObject;

        return firstName.equals(other.firstName) && lastName.equals(other.lastName) &&
                pesel.equals(other.pesel);

    }

    public int hashCode() {
        return Objects.hash(firstName, lastName, pesel);
    }

    public String toString() {
        return lastName + " " + firstName + ", pesel: " + pesel;
    }
}
