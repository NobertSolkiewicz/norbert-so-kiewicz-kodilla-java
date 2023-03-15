package com.kodilla.testing.forum.statistics;

import com.kodilla.testing.forum.ForumUser;

import java.util.ArrayList;
import java.util.List;

public class CalculateStatistics implements Statistics {
    private int usersCount;
    private int postsCount;
    private int commentsCount;
    private double averagePostsPerUsers;
    private double averageCommentsPerUsers;
    private double averageCommentsPerPost;
    private Statistics statistics;

    public CalculateStatistics(Statistics statistics) {
        this.statistics = statistics;
    }

    public CalculateStatistics(int usersCount, int postsCount, int commentsCount) {
        this.usersCount = usersCount;
        this.postsCount = postsCount;
        this.commentsCount = commentsCount;
    }

    @Override
    public List<String> usersNames() {
        return statistics.usersNames();
    }

    @Override
    public int postCount() {
        return postsCount;
    }

    @Override
    public int commentsCount() {
        return commentsCount;
    }

    public Statistics calculateAdvStatistics(Statistics statistics) {
        usersCount = usersNames().size();
        postsCount = postCount();
        commentsCount = commentsCount();
        if (postsCount != 0 && commentsCount != 0) {
            averagePostsPerUsers = usersNames().size() / postCount();
            averageCommentsPerPost = usersNames().size() / commentsCount();
            averageCommentsPerUsers = postCount() / commentsCount();
        }
        else {
            return null;
        }
        return statistics;
    }

    public void showStatistics() {
        System.out.println("Count of users is: " + usersCount);
        System.out.println("Count of posts is: " + postsCount);
        System.out.println("Count of comments is: " + commentsCount);
        System.out.println("average post per user: " + averagePostsPerUsers);
        System.out.println("average comments per user: " + averageCommentsPerUsers);
        System.out.println("average comments per post: " + averageCommentsPerPost);
    }
}
