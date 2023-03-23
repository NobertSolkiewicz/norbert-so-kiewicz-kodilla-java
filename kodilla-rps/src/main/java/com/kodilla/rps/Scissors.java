package com.kodilla.rps;

import java.util.Objects;

public class Scissors {
    private final int id;
    private final String name;

    public Scissors(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Scissors scissors = (Scissors) o;
        return id == scissors.id && Objects.equals(name, scissors.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Scissors{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
