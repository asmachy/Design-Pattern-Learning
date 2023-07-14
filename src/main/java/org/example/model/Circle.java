package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Circle implements Shape{
    private double radius;
    @Override
    public double calculateArea() {
        return this.radius * this.radius;
    }

    @Override
    public String getShapeToString() {
        return "Circle";
    }

    @Override
    public double getPerimeter() {
        return 2*3.14159*this.radius;
    }
}
