package com.kodilla.patterns2.observer.homework;

import com.kodilla.patterns2.observer.forum.ForumTopic;
import com.kodilla.patterns2.observer.forum.ForumUser;
import com.kodilla.patterns2.observer.forum.JavaHelpForumTopic;
import com.kodilla.patterns2.observer.forum.JavaToolsForumTopic;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TrainneQueueTestSuite {

    @Test
    void TestUptade() {
        //Given
        TraineeQueue taskTicTacToe = new TaskTicTacToe();
        TraineeQueue taskQueueToCheck = new TaskQueueToCheck();
        MentorQueue johnSnow = new MentorQueue("John Snow");
        MentorQueue geraltRivia = new MentorQueue("Gearlt Rivia");

        taskTicTacToe.registerObserver(johnSnow);
        taskQueueToCheck.registerObserver(geraltRivia);
        taskTicTacToe.registerObserver(geraltRivia);
        //When
        taskTicTacToe.addTask("Hi John, I can't invent an algorithm for the diagonal");
        taskTicTacToe.addTask("Maybe nested loop will be better");
        taskQueueToCheck.addTask("This tasks is very hard i have no idea, how to solve it");
        taskTicTacToe.addTask("Oh thanks now it's work perfectly");
        taskQueueToCheck.addTask("Okay i think i know how to solve this problem");
        //Then
        assertEquals(3, johnSnow.getUpdateCount());
        assertEquals(5, geraltRivia.getUpdateCount());

    }
}
