package com.kodilla.rps;

import java.util.Objects;

public class Rock {
    private final int id;
    private final String name;

    public Rock(int id, String name) {
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
        Rock rock = (Rock) o;
        return id == rock.id && Objects.equals(name, rock.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Rock{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
