package com.kodilla.stream.portfolio;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class BoardTestSuite {

    private Board project;


    public Board prepareTestData() {
        //users
        User user1 = new User("developer1", "John Smith");
        User user2 = new User("projectmanager1", "Nina White");
        User user3 = new User("developer2", "Emilia Stephanson");
        User user4 = new User("developer3", "Konrad Bridge");
        //tasks
        Task task1 = new Task("Microservice for taking temperature",
                "Write and test the microservice taking\n" +
                        "the temperaure from external service",
                user1,
                user2,
                LocalDate.now().minusDays(20),
                LocalDate.now().plusDays(30));
        Task task2 = new Task("HQLs for analysis",
                "Prepare some HQL queries for analysis",
                user1,
                user2,
                LocalDate.now().minusDays(20),
                LocalDate.now().minusDays(5));
        Task task3 = new Task("Temperatures entity",
                "Prepare entity for temperatures",
                user3,
                user2,
                LocalDate.now().minusDays(20),
                LocalDate.now().plusDays(15));
        Task task4 = new Task("Own logger",
                "Refactor company logger to meet our needs",
                user3,
                user2,
                LocalDate.now().minusDays(10),
                LocalDate.now().plusDays(25));
        Task task5 = new Task("Optimize searching",
                "Archive data searching has to be optimized",
                user4,
                user2,
                LocalDate.now(),
                LocalDate.now().plusDays(5));
        Task task6 = new Task("Use Streams",
                "use Streams rather than for-loops in predictions",
                user4,
                user2,
                LocalDate.now().minusDays(15),
                LocalDate.now().minusDays(2));
        //taskLists
        TaskList taskListToDo = new TaskList("To do");
        taskListToDo.addTask(task1);
        taskListToDo.addTask(task3);
        TaskList taskListInProgress = new TaskList("In progress");
        taskListInProgress.addTask(task5);
        taskListInProgress.addTask(task4);
        taskListInProgress.addTask(task2);
        TaskList taskListDone = new TaskList("Done");
        taskListDone.addTask(task6);
        //board
        Board project = new Board("Project Weather Prediction");
        project.addTaskList(taskListToDo);
        project.addTaskList(taskListInProgress);
        project.addTaskList(taskListDone);
        return project;
    }

    @Before
    public void createProject() {
        project = prepareTestData();
    }

    @Test
    public void testAddTaskList() {

        //Then
        Assert.assertEquals(3, project.getTaskLists().size());
    }


    @Test
    public void testAddTaskListFindUsersTasks() {

        //When
        long taskCounter = project.getTaskLists().stream()
                .flatMap(task -> task.getTasks().stream())
                .filter(task -> task.getAssignedUser().getUsername().equals("developer1"))
                .count();

        //Then
        Assert.assertEquals(2, taskCounter);

    }

    @Test
    public void testAddTaskListFindOutdatedTasks() {

        //When
        List<Task> outdatedTasks = project.getTaskLists().stream()
                .filter(taskList -> taskList.getName().equals("To do") || taskList.getName().equals("In progress"))
                .flatMap(task -> task.getTasks().stream())
                .filter(task -> task.getDeadline().isBefore(LocalDate.now()))
                .collect(toList());

        //Then
        Assert.assertEquals(1, outdatedTasks.size());
        Assert.assertEquals("HQLs for analysis", outdatedTasks.get(0).getTitle());

    }

    @Test
    public void testAddTaskListFindLongTasks() {

        //When
        long longTasks = project.getTaskLists().stream()
                .filter(taskList -> taskList.getName().equals("In progress"))
                .flatMap(task -> task.getTasks().stream())
                .map(task -> task.getCreated())
                .filter(task -> task.compareTo(LocalDate.now().minusDays(10)) <= 0)
                .count();

        //Then
        Assert.assertEquals(2, longTasks);
    }


    @Test
    public void testAddTaskListAverageWorkingOnTask() {

        //When
        double average = project.getTaskLists().stream()
                .filter(taskList -> taskList.getName().equals("In progress"))
                .flatMap(task -> task.getTasks().stream())
                .mapToDouble(task -> ChronoUnit.DAYS.between(task.getCreated(), LocalDate.now()))
                .average()
                .getAsDouble();

        //Then
        Assert.assertEquals(10.0, average, 0.0001);
    }
}
