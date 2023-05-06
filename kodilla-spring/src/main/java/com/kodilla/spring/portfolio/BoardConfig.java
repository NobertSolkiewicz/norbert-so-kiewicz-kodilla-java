package com.kodilla.spring.portfolio;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;

@Configuration
public class BoardConfig {

    @Bean
    public Board getBoard() {
        return new Board(getToDoList(), getInProgressList(), getDoneList());
    }

    @Bean
    public TaskList<String> getToDoList() {
        return new TaskList<>(new ArrayList<>());
    }

    @Bean
    public TaskList<String> getInProgressList() {
        return new TaskList<>(new ArrayList<>());
    }

    @Bean
    public TaskList<String> getDoneList() {
        return new TaskList<>(new ArrayList<>());
    }
}
