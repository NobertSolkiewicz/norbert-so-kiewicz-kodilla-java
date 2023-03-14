package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {
//    private Figure figure;
    private Shape shape;
    private List<Shape> figures = new ArrayList<>();

    public ShapeCollector(Shape shape) {
        this.shape = shape;
    }

    public void addFigure(Shape shape) {
        figures.add(shape);
    }

    public boolean removeFigure(Shape shape) {
        boolean result = false;
        if (figures.contains(shape)) {
            figures.remove(shape);
            result = true;
        }
        return result;
    }

    public Shape getFigure(int n) {
        Shape shape1 = null;
        if (n >= 0 && n < figures.size()) {
            shape1 = figures.get(n);
        }
        return shape1;
    }

    public void showFigures() {
        System.out.println(shape.getShapeName());
    }
}
