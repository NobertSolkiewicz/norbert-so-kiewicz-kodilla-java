package com.kodilla.spring.portfolio;


import java.util.ArrayList;
import java.util.List;

public class TaskList<String> {
    private List<String> tasks;


    public TaskList(List<String > tasks) {
        tasks = new ArrayList<>();
    }
}
