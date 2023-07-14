package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Rectangle implements Shape{
    private double length, width;
    @Override
    public double calculateArea() {
        return this.length * this.width;
    }

    @Override
    public String getShapeToString() {
        return "Rectangle";
    }

    @Override
    public double getPerimeter() {
        return 2*(this.width + this.length);
    }
}
