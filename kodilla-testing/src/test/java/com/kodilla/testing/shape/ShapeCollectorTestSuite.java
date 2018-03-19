package com.kodilla.testing.shape;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ShapeCollectorTestSuite {

    private ShapeCollector testCollector;

    @Before
    public void createCollector() {
        testCollector = new ShapeCollector();
    }

    @Test
    public void addFigureTest() {
        Shape testShape = new Square(2);

        testCollector.addFigure(testShape);

        Assert.assertTrue(testCollector.getFigure(0).equals(testShape));
    }

    @Test
    public void removeExistingFigureTest() {
        Shape testShape = new Square(2);
        testCollector.addFigure(testShape);

        boolean isRemoved = testCollector.removeFigure(testShape);

        Assert.assertTrue(isRemoved);
    }

    @Test
    public void removeNotExistingFigureTest() {
        Shape testShape = new Square(2);

        boolean isRemoved = testCollector.removeFigure(testShape);

        Assert.assertFalse(isRemoved);
    }

    @Test
    public void getFigureFromCorrectIndexTest() {
        Shape square = new Square(2);
        Shape circle = new Circle(4);
        testCollector.addFigure(square);
        testCollector.addFigure(circle);

        Assert.assertTrue(testCollector.getFigure(1).equals(circle));
        Assert.assertFalse(testCollector.getFigure(1).equals(square));
    }

    @Test(expected = IllegalArgumentException.class)
    public void getFigureFromWrongIndexTest() {
        Shape square = new Square(2);
        testCollector.addFigure(square);

        testCollector.getFigure(4);
    }
}
