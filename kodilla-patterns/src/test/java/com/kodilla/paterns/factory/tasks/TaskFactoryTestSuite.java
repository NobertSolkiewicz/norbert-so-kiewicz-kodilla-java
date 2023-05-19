package com.kodilla.paterns.factory.tasks;

import com.kodilla.patterns.factory.tasks.TaskFactory;
import com.kodilla.patterns.factory.tasks.Tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TaskFactoryTestSuite {

    @Test
    void testFactoryDriving() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Tasks driving = factory.makeTasks(TaskFactory.DRIVINGTASK);
        //Then
        assertEquals("DrivingTask", driving.getTaskName());
        assertEquals("Driving task is executing", driving.executeTask());
        assertFalse(driving.isTaskExecuted());

    }

    @Test
    void testFactoryPainting() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Tasks painting = factory.makeTasks(TaskFactory.PAINTINGTASK);
        //Then
        assertEquals("PaintingTask", painting.getTaskName());
        assertEquals("Painting task is executing", painting.executeTask());
        assertFalse(painting.isTaskExecuted());

    }

    @Test
    void testFactoryShopping() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Tasks shopping = factory.makeTasks(TaskFactory.SHOPPINGTASK);
        //Then
        assertEquals("ShoppingTask", shopping.getTaskName());
        assertEquals("Shopping task is executing", shopping.executeTask());
        assertFalse(shopping.isTaskExecuted());

    }
}
