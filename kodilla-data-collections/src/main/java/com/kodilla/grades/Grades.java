package com.kodilla.grades;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Grades {
    private List<Integer> grades;

    public Grades(int number) {
        grades = new ArrayList<>();

        while (number > 0) {
            int grade = new Random().nextInt(6) + 1;
            grades.add(grade);
            number--;
        }
    }

    public void printGradesAndAverage() {
        System.out.print("Student's grades: ");
        for (Integer grade : grades) {
            System.out.print(grade + " ");
        }
        System.out.printf("\nGrades average: %.2f\n", countAverage());
    }

    private double countAverage() {
        int sum = 0;
        for(int i = 0; i < grades.size(); i++) {
            sum += grades.get(i);
        }
        double average = (double) sum / (grades.size());
        return average;
    }
}
