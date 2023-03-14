package com.kodilla.testing.shape;

public class Triangle implements Shape {
    private String name;
    private int field;

    @Override
    public String getShapeName() {
        return name;
    }

    @Override
    public int getField() {
        return field;
    }
}
