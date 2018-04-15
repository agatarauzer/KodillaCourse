package com.kodilla.grades;

import java.util.HashMap;
import java.util.Map;

public class Register {
    private Map<Student, Grades> register = new HashMap<>();

    public void addStudent(Student student, Grades grades) {
        register.put(student, grades);
    }

    public void printStudentsInfo() {
        for (Map.Entry<Student, Grades> entry : register.entrySet()) {
            System.out.println("STUDENT\n" + entry.getKey());
            entry.getValue().printGradesAndAverage();
        }
    }
}
