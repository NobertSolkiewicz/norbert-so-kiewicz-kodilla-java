package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class TraineeQueue implements Observable {
    private final List<Observer> observers;
    private final List<String> messages;
    private final String name;

    public TraineeQueue(String username) {
        observers = new ArrayList<>();
        messages = new ArrayList<>();
        this.name = username;
    }

    public void addTask(String task) {
        messages.add(task);
        notifyObserves();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObserves() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    @Override
    public void removeObserver (Observer observer) {
        observers.remove(observer);
    }

    public List<String> getMessages() {
        return messages;
    }

    public String getName() {
        return name;
    }
}
