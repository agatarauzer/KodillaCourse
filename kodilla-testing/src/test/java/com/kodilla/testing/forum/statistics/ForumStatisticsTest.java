package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumStatisticsTest {

    private Statistics statisticsMock;
    private ForumStatistics forumStats;

    @Before
    public void create() {
        statisticsMock = mock(Statistics.class);
        forumStats = new ForumStatistics();
    }

    @Test(expected = IllegalArgumentException.class)
    public void zeroPostsTest_ThrowsException() {
        //given
        int users = 4;
        List<String> usersList = generateUsersList(users);
        when(statisticsMock.userNames()).thenReturn(usersList);
        int posts = 0;
        when(statisticsMock.postsCount()).thenReturn(posts);
        int comments = 8;
        when(statisticsMock.commentsCount()).thenReturn(comments);

        //when
        forumStats.calculateAdvStatistics(statisticsMock);
    }

    @Test(expected = IllegalArgumentException.class)
    public void zeroUsersTest() {
        //given
        int users = 0;
        List<String> usersList = generateUsersList(users);
        when(statisticsMock.userNames()).thenReturn(usersList);
        int posts = 10;
        when(statisticsMock.postsCount()).thenReturn(posts);
        int comments = 8;
        when(statisticsMock.commentsCount()).thenReturn(comments);

        //when
        forumStats.calculateAdvStatistics(statisticsMock);
    }

    @Test
    public void zeroCommentsTest() {
        //given
        int users = 10;
        List<String> usersList = generateUsersList(users);
        when(statisticsMock.userNames()).thenReturn(usersList);
        int posts = 10;
        when(statisticsMock.postsCount()).thenReturn(posts);
        int comments = 0;
        when(statisticsMock.commentsCount()).thenReturn(comments);

        //when
        forumStats.calculateAdvStatistics(statisticsMock);
        double commentsPerUser = forumStats.getCommentsPerUser();
        double commentsPerPost = forumStats.getCommentsPerPost();

        //then
        Assert.assertEquals(0.0, commentsPerUser, 0.1f);
        Assert.assertEquals(0.0, commentsPerPost,0.1f);
    }


    @Test
    public void correctDataTest_CommentsNumberLowerThanPostsNumber() {
        //given
        int users = 100;
        List<String> usersList = generateUsersList(users);
        when(statisticsMock.userNames()).thenReturn(usersList);
        int posts = 1000;
        when(statisticsMock.postsCount()).thenReturn(posts);
        int comments = 200;
        when(statisticsMock.commentsCount()).thenReturn(comments);

        //when
        forumStats.calculateAdvStatistics(statisticsMock);
        double commentsPerUser = forumStats.getCommentsPerUser();
        double commentsPerPost = forumStats.getCommentsPerPost();
        double postsPerUser = forumStats.getPostsPerUser();

        //then
        Assert.assertEquals(2.0, commentsPerUser, 0.1f);
        Assert.assertEquals(0.2, commentsPerPost,0.1f);
        Assert.assertEquals(10.0, postsPerUser, 0.1f);

    }

    @Test
    public void correctDataTest_CommentsNumberHigherThanPostsNumber() {
        //given
        int users = 20;
        List<String> usersList = generateUsersList(users);
        when(statisticsMock.userNames()).thenReturn(usersList);
        int posts = 200;
        when(statisticsMock.postsCount()).thenReturn(posts);
        int comments = 400;
        when(statisticsMock.commentsCount()).thenReturn(comments);

        //when
        forumStats.calculateAdvStatistics(statisticsMock);
        double commentsPerUser = forumStats.getCommentsPerUser();
        double commentsPerPost = forumStats.getCommentsPerPost();
        double postsPerUser = forumStats.getPostsPerUser();

        //then
        Assert.assertEquals(20.0, commentsPerUser, 0.1f);
        Assert.assertEquals(2.0, commentsPerPost,0.1f);
        Assert.assertEquals(10.0, postsPerUser, 0.1f);
    }


    private List<String> generateUsersList(int number) {
        List<String> users = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            String name = "name";
            users.add(name);
        }
        return users;
    }
}
