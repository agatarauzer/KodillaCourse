package com.kodilla.testing.forum.statistics;


public class ForumStatistics {
    private int usersNumber;
    private int postsNumber;
    private int commentsNumber;
    private double postsPerUser;
    private double commentsPerUser;
    private double commentsPerPost;

    public void calculateAdvStatistics(Statistics statistics) {
        usersNumber = statistics.userNames().size();
        postsNumber = statistics.postsCount();
        commentsNumber = statistics.commentsCount();

        if (usersNumber <= 0) {
            throw new IllegalArgumentException("Users number must be positive!");
        }
        else {
            postsPerUser = (double) postsNumber / usersNumber;
            commentsPerUser = (double) commentsNumber / usersNumber;
        }

        if (postsNumber <= 0) {
            throw new IllegalArgumentException("Posts number must be positive to " +
                    "count this statistic!");
        }
        else {
            commentsPerPost = (double) commentsNumber / postsNumber;
        }
    }

    public void showStatistics() {
        System.out.println("STATISTICS\nUsers: " + usersNumber +
         "\nPosts:" + postsNumber + "\nComments:" + commentsNumber +
         "\nPosts per user: " + postsPerUser + "\nComments per user: " + commentsPerUser +
        "\nComments per post: " + commentsPerPost);
    }

    public int getUsersNumber() {
        return usersNumber;
    }

    public int getPostsNumber() {
        return postsNumber;
    }

    public int getCommentsNumber() {
        return commentsNumber;
    }

    public double getPostsPerUser() {
        return postsPerUser;
    }

    public double getCommentsPerUser() {
        return commentsPerUser;
    }

    public double getCommentsPerPost() {
        return commentsPerPost;
    }
}
