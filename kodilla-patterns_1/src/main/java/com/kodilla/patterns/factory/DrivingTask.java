package com.kodilla.patterns.factory;

public class DrivingTask implements Task {
    private String taskName;
    private String where;
    private String using;
    private boolean isDone = false;

    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
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
