package com.kodilla.rps;

import java.util.Objects;

public class Paper {
    private final int id;
    private final String name;

    public Paper(int id, String name) {
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
        Paper paper = (Paper) o;
        return id == paper.id && Objects.equals(name, paper.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Paper{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
