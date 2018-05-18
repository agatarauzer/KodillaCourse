package com.kodilla.patterns.factory;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TaskFactoryTests {
    private TaskFactory taskFactory;

    @Before
    public void createFactory() {
        taskFactory = new TaskFactory();
    }

    @Test
    public void testCreatingShoppingTask() {
        //When
        Task shop = taskFactory.createTask(TaskFactory.SHOPPING);
        String taskName = shop.getTaskName();

        //Then
        Assert.assertEquals("food shopping", taskName);
    }

    @Test
    public void testCreatingPaintingTask() {
        //When
        Task paint = taskFactory.createTask(TaskFactory.PAINTING);
        String taskName = paint.getTaskName();

        //Then
        Assert.assertEquals("living room painting", taskName);
    }

    @Test
    public void testCreatingDrivingTask() {
        //When
        Task drive = taskFactory.createTask(TaskFactory.DRIVING);
        String taskName = drive.getTaskName();

        //Then
        Assert.assertEquals("drive to mom", taskName);
    }
}
