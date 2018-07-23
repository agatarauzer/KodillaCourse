package com.kodilla.patterns_2.observer.homework;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HomeworkTasksTests {

    private HomeworkTasks week_1;
    private HomeworkTasks week_2;
    private Mentor mentor_1;
    private Mentor mentor_2;


    @Before
    public void createData() {
        week_1 = new TasksWeek1();
        week_2 = new TasksWeek2();

        mentor_1 = new Mentor("Liza");
        mentor_2 = new Mentor("Sara");

        week_1.registerObserver(mentor_1);
        week_1.registerObserver(mentor_2);

        week_2.registerObserver(mentor_2);
    }

    @Test
    public void updatesForTwoMentorsTest() {
        //When
        week_1.addTask("exercise 1.1");
        week_1.addTask("exercise 1.2");
        week_2.addTask("exercise 2.1");

        //Then
        Assert.assertEquals(2, mentor_1.getUpdateCounter());
        Assert.assertEquals(3, mentor_2.getUpdateCounter());
    }

}
