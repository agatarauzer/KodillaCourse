package com.kodilla.grades;

public class App {
    public static void main(String[] args) {

        Register register = new Register();

        Student student1 = new Student("Jennifer", "Taylor", "12345678901");
        Student student2 = new Student("Monica", "Kowalski", "12345612345");
        Student student3 = new Student("Robert", "Greenfield", "12345698765");

        register.addStudent(student1, new Grades(10));
        register.addStudent(student2, new Grades(8));
        register.addStudent(student3, new Grades(5));

        register.printStudentsInfo();
    }
}
