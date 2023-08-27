package com.kodilla.patterns2.observer.homework;

public class MentorQueue implements Observer {
    private final String username;
    private int updateCount;

    public MentorQueue(String username) {
        this.username = username;
    }

    @Override
    public void update(TraineeQueue traineeQueue) {
        System.out.println(username + ": New task in queue " + traineeQueue.getName() + "\n" +
                "(total: " + traineeQueue.getMessages().size() + " tasks)");
        updateCount++;
    }

    public String getUsername() {
        return username;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
