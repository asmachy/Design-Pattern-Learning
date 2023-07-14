package org.example;
import org.example.model.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ShapeFactoryTest {
    @Test
    void testGetShapeCircle() {
        // Arrange
        String type = "Circle";
        double radius = 5.0;

        // Act
        Shape shape = ShapeFactory.getShape(type, radius);

        // Assert
        Assertions.assertTrue(shape instanceof Circle);
        Circle circle = (Circle) shape;
        Assertions.assertEquals(radius, circle.getRadius());
    }

    @Test
    void testGetShapeCircleExtraParameter() {
        // Arrange
        String type = "Circle";
        double radius = 5.0;
        double extraParameter1 = 5.0;
        double extraParameter2 = 5.0;

        // Act and Assert
        Assertions.assertThrows(IllegalArgumentException.class, () -> ShapeFactory.getShape(type, radius, extraParameter1));
        Assertions.assertThrows(IllegalArgumentException.class, () -> ShapeFactory.getShape(type, radius, extraParameter1, extraParameter2));
    }

    @Test
    void testGetShapeSquare() {
        // Arrange
        String type = "Square";
        double sideLength = 10.0;

        // Act
        Shape shape = ShapeFactory.getShape(type, sideLength);

        // Assert
        Assertions.assertTrue(shape instanceof Square);
        Assertions.assertEquals(sideLength * sideLength, shape.calculateArea());
        Square square = (Square) shape;
        Assertions.assertEquals(sideLength, square.getSide());
    }

    @Test
    void testGetShapeSquareExtraParameter() {
        // Arrange
        String type = "Square";
        double sideLength = 10.0;
        double extraParameter = 10.0;
        double extraParameter2 = 10.0;

        // Act and Assert
        Assertions.assertThrows(IllegalArgumentException.class, () -> ShapeFactory.getShape(type, sideLength, extraParameter));
        Assertions.assertThrows(IllegalArgumentException.class, () -> ShapeFactory.getShape(type, sideLength, extraParameter, extraParameter2));
    }

    @Test
    void testGetShapeRectangle() {
        // Arrange
        String type = "Rectangle";
        double length = 5.0;
        double width = 10.0;

        // Act
        Shape shape = ShapeFactory.getShape(type, length, width);

        // Assert
        Assertions.assertTrue(shape instanceof Rectangle);
        Rectangle rectangle = (Rectangle) shape;
        Assertions.assertEquals(length, rectangle.getLength());
        Assertions.assertEquals(width, rectangle.getWidth());
    }

    @Test
    void testGetShapeRectangleMissingParameter() {
        // Arrange
        String type = "Rectangle";
        double length = 5.0;

        // Act and Assert
        Assertions.assertThrows(IllegalArgumentException.class, () -> ShapeFactory.getShape(type, length));
    }

    @Test
    void testGetShapeRectangleExtraParameter() {
        // Arrange
        String type = "Rectangle";
        double radius = 5.0;
        double extraParameter1 = 5.0;
        double extraParameter2 = 5.0;

        // Act and Assert
        Assertions.assertThrows(IllegalArgumentException.class, () -> ShapeFactory.getShape(type, radius, extraParameter1, extraParameter2));
    }

    @Test
    void testGetShapeTriangle() {
        // Arrange
        String type = "Triangle";
        double side1 = 3.0;
        double side2 = 4.0;
        double side3 = 5.0;

        // Act
        Shape shape = ShapeFactory.getShape(type, side1, side2, side3);

        // Assert
        Assertions.assertTrue(shape instanceof Triangle);
        Triangle triangle = (Triangle) shape;
        Assertions.assertEquals(side1, triangle.getSide1());
        Assertions.assertEquals(side2, triangle.getSide2());
        Assertions.assertEquals(side3, triangle.getSide3());
    }

    @Test
    void testGetShapeTriangleMissingParameter() {
        // Arrange
        String type = "Triangle";
        double base = 8.0;
        double height = 6.0;

        // Act and Assert
        Assertions.assertThrows(IllegalArgumentException.class, () -> ShapeFactory.getShape(type, base));
        Assertions.assertThrows(IllegalArgumentException.class, () -> ShapeFactory.getShape(type, base, height));
    }

    @Test
    void testGetShapeUnknownType() {
        // Arrange
        String type = "Pentagon";
        double parameter = 10.0;

        // Act and Assert
        Assertions.assertThrows(IllegalArgumentException.class, () -> ShapeFactory.getShape(type, parameter));
    }
}
