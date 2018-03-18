package com.kodilla.testing.shape;

import org.junit.Assert;
import org.junit.Test;

public class ShapeCollectorTestSuite {


    @Test
    public void addFigureTest() {
        ShapeCollector testCollector = new ShapeCollector();
        Shape testShape = new Square(2);

        testCollector.addFigure(testShape);

        Assert.assertTrue(testCollector.getFigure(0).equals(testShape));
    }

    @Test
    public void removeExistingFigureTest() {
        ShapeCollector testCollector = new ShapeCollector();
        Shape testShape = new Square(2);
        testCollector.addFigure(testShape);

        boolean isRemoved = testCollector.removeFigure(testShape);

        Assert.assertTrue(isRemoved);
    }

    @Test
    public void removeNotExistingFigureTest() {
        ShapeCollector testCollector = new ShapeCollector();
        Shape testShape = new Square(2);

        boolean isRemoved = testCollector.removeFigure(testShape);

        Assert.assertFalse(isRemoved);
    }

    @Test
    public void getFigureFromCorrectIndexTest() {
        ShapeCollector testCollector = new ShapeCollector();
        Shape square = new Square(2);
        Shape circle = new Circle(4);
        testCollector.addFigure(square);
        testCollector.addFigure(circle);

        Assert.assertTrue(testCollector.getFigure(1).equals(circle));
        Assert.assertFalse(testCollector.getFigure(1).equals(square));
    }

    @Test(expected = IllegalArgumentException.class)
    public void getFigureFromWrongIndexTest() {
        ShapeCollector testCollector = new ShapeCollector();
        Shape square = new Square(2);
        testCollector.addFigure(square);

        testCollector.getFigure(4);
    }
}
