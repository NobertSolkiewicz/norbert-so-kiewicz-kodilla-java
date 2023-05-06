package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

@SpringBootTest
public class BoardTestSuite {

    @Test
    void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        ArrayList<String> toDoList = new ArrayList<>();
        ArrayList<String> inProgressList = new ArrayList<>();
        ArrayList<String> doneList = new ArrayList<>();
        TaskList tasks1 = new TaskList(toDoList);
        TaskList tasks2 = new TaskList(inProgressList);
        TaskList tasks3 = new TaskList(doneList);
        String kodilla = "kodilla";
        String clear = "clear";
        String painWall = "paintWall";

        //When
        toDoList.add(kodilla);
        inProgressList.add(clear);
        doneList.add(painWall);

        //Then
        assertEquals(toDoList, tasks1);
        assertEquals(inProgressList, tasks2);
        assertEquals(doneList, tasks3);

    }
}
