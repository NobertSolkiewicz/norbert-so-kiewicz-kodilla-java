package com.kodilla.spring.portfolio;

import java.util.List;

public class Board {
    private TaskList<String> toDolist;
    private TaskList<String> inProgressList;
    private TaskList<String> doneList;

    public Board(TaskList<String> toDolist, TaskList<String> inProgressList, TaskList<String> doneList) {
        this.toDolist = toDolist;
        this.inProgressList = inProgressList;
        this.doneList = doneList;
    }

    public TaskList<String> getToDolist() {
        return toDolist;
    }

    public TaskList<String> getInProgressList() {
        return inProgressList;
    }

    public TaskList<String> getDoneList() {
        return doneList;
    }
}
