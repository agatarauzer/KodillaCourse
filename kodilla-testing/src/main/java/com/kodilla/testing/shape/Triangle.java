package com.kodilla.testing.shape;

public class Triangle implements Shape {

    private double lengthOfBase;
    private double height;

    public Triangle(double lengthOfBase, double height) {
        this.lengthOfBase = lengthOfBase;
        this.height = height;
    }

    public String getShapeName() {
        return "triangle";
    }

    public double getField() {
        return (lengthOfBase * height) / 2;
    }
}
