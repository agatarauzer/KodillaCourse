package com.kodilla.patterns.factory;

public class ShoppingTask implements Task {
    private String taskName;
    private String whatToBuy;
    private double quantity;
    private boolean isDone = false;

    public ShoppingTask(String taskName, String whatToBuy, double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
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
