package com.kodilla.patterns.factory.tasks;

public class DrivingTask implements Tasks{

    private final String taskName;
    private final String where;
    private final String using;

    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    @Override
    public String executeTask() {
        return "Driving task is executing";
    }

    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return false;
    }

    public String getWhere() {
        return where;
    }

    public String getUsing() {
        return using;
    }
}
