package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTests {
    @Autowired
    private TaskListDao taskListDao;
    private static final String LISTNAME = "Learn JAVA";
    private static final String DESCRIPTION = "Learning Java technologies";

    @Test
    public void testFindByListName() {
        //Given
        TaskList taskList = new TaskList(LISTNAME, DESCRIPTION);

        //When
        taskListDao.save(taskList);
        List<TaskList> lists = taskListDao.findByListName(LISTNAME);

        //Then
        Assert.assertEquals(1, lists.size());

        //Clean up
        int id = lists.get(0).getId();
        taskListDao.delete(id);
    }
}
