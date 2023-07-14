package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Square implements Shape {
    private double side;
    @Override
    public double calculateArea() {
        return this.side * this.side;
    }

    @Override
    public String getShapeToString() {
        return "Square";
    }

    @Override
    public double getPerimeter() {
        return 4*side;
    }
}