package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTests {

    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Board board = context.getBean(Board.class);

        String toDoTask = "first task";
        String inProgressTask = "second task";
        String doneTask = "third task";

        board.addTaskToDo(toDoTask);
        board.addTaskInProgress(inProgressTask);
        board.addTaskDone(doneTask);

        //When
        String task1 = board.getToDoList().getTask(0);
        String task2 = board.getInProgressList().getTask(0);
        String task3 = board.getDoneList().getTask(0);

        //Then
        Assert.assertEquals(toDoTask, task1);
        Assert.assertEquals(inProgressTask, task2);
        Assert.assertEquals(doneTask, task3);
    }
}
