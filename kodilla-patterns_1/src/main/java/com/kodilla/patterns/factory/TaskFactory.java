package com.kodilla.patterns.factory;

public class TaskFactory {
    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public final Task createTask(final String kindOfTask) {
        switch (kindOfTask) {
            case SHOPPING:
                return new ShoppingTask("food shopping", "bread", 2 );
            case PAINTING:
                return new PaintingTask("living room painting", "white", "living room");
            case DRIVING:
                return new DrivingTask("drive to mom", "mom", "car");
            default:
                return null;
        }
    }
}
