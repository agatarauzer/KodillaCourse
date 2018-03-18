package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

    private List<Shape> shapes = new ArrayList<>();

    public void addFigure(Shape shape) {
        shapes.add(shape);
    }

    public boolean removeFigure(Shape shape) {
        if (shapes.contains(shape)) {
            shapes.remove(shape);
            return true;
        }
        else {
            return false;
        }
    }

    public Shape getFigure(int n) {
        if (shapes.size() > n && n >= 0) {
            return shapes.get(n);
        }
        else {
            throw new IllegalArgumentException("Wrong index");
        }
    }

    public void showFigures() {
        for (Shape shape : shapes) {
            System.out.printf("Shape: " + shape.getShapeName() + ", area %.2f\n", shape.getField());
        }
    }
}
