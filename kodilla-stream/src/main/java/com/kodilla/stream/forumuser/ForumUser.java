package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private final int id;
    private final String username;
    private final char sex;
    private final LocalDate birthday;
    private final int postCount;

    public ForumUser(int id, String username, char sex, LocalDate birthday, int postCount) {
        this.id = id;
        this.username = username;
        this.sex = sex;
        this.birthday = birthday;
        this.postCount = postCount;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public int getPostCount() {
        return postCount;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", sex=" + sex +
                ", birthday=" + birthday +
                ", postCount=" + postCount +
                '}';
    }
}
