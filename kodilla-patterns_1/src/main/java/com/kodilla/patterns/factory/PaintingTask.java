package com.kodilla.patterns.factory;

public class PaintingTask implements Task {
    private String taskName;
    private String color;
    private String whatToPaint;
    private boolean isDone = false;

    public PaintingTask(String taskName, String color, String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    public void executeTask() {
        if (!isDone) {
            isDone = true;
        }
        else {
            System.out.println("Task has been already executed!");
        }
    }

    public String getTaskName() {
        return taskName;
    }

    public boolean isTaskExecuted() {
        return isDone;
    }
}
