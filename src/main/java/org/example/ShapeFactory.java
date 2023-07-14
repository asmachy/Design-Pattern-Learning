package org.example;

import org.example.model.*;

public class ShapeFactory {
    public static Shape getShape(String type, double firstElement) {
        return switch (type) {
            case "Circle" -> new Circle(firstElement);
            case "Square" -> new Square(firstElement);
            case "Rectangle" -> throw new IllegalArgumentException("missing parameter for rectangle");
            case "Triangle" -> throw new IllegalArgumentException("missing parameter for triangle");
            default -> throw new IllegalArgumentException("Unknown Shape Type");
        };
    }
    public static Shape getShape(String type, double firstElement, double secondElement) {
        return switch (type) {
            case "Rectangle" -> new Rectangle(firstElement, secondElement);
            case "Circle" -> throw new IllegalArgumentException("extra parameter for circle");
            case "Square" -> throw new IllegalArgumentException("extra parameter for square");
            case "Triangle" -> throw new IllegalArgumentException("missing parameter for triangle");
            default -> throw new IllegalArgumentException("Unknown Shape Type");
        };

    }
    public static Shape getShape(String type, double firstElement, double secondElement, double thirdElement) {
        return switch (type) {
            case "Triangle" -> new Triangle(firstElement, secondElement, thirdElement);
            case "Rectangle" -> throw new IllegalArgumentException("extra parameter for rectangle");
            case "Circle" -> throw new IllegalArgumentException("extra parameter for circle");
            case "Square" -> throw new IllegalArgumentException("extra parameter for square");

            default -> throw new IllegalArgumentException("Unknown Shape Type");
        };
    }
}
