package com.kodilla.patterns.factory.tasks;

public class PaintingTask implements Tasks {

    private final String taskName;
    private final String color;
    private final String whatToPaint;

    public PaintingTask(String taskName, String color, String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    @Override
    public String executeTask() {
        return "Painting task is executing";
    }

    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return false;
    }

    public String getColor() {
        return color;
    }

    public String getWhatToPaint() {
        return whatToPaint;
    }
}
