package com.kodilla.patterns_2.observer.homework;

public class Mentor implements Observer {

    private final String name;
    private int updateCounter;

    public Mentor(String name) {
        this.name = name;
    }

    @Override
    public void update(HomeworkTasks homeworkTasks) {
        System.out.println( homeworkTasks.getClass().getSimpleName() + " New task to check from user: " + homeworkTasks.getStudentName());
        updateCounter++;
    }

    public String getName() {
        return name;
    }

    public int getUpdateCounter() {
        return updateCounter;
    }
}
