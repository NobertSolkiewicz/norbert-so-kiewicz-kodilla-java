package com.kodilla.patterns.factory.tasks;

public class TaskFactory {

    public static final String DRIVINGTASK = "DrivingTask";
    public static final String PAINTINGTASK = "PaintingTask";
    public static final String SHOPPINGTASK = "ShoppingTask";

    public final Tasks makeTasks(final String taskClass) {
        return switch (taskClass) {
            case DRIVINGTASK -> new DrivingTask("DrivingTask", "Krakow", "Car");
            case PAINTINGTASK -> new PaintingTask("PaintingTask", "Yellow", "Wall");
            case SHOPPINGTASK -> new ShoppingTask("ShoppingTask", "Sausage", 2.50);
            default -> null;
        };
    }
}
