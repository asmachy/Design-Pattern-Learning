package org.example.model;

import lombok.Getter;

import static java.lang.Math.abs;
import static java.lang.Math.sqrt;

@Getter
public class Triangle implements Shape {
    private double side1, side2, side3;
    public Triangle(double side1, double side2, double side3) {
        if(abs(side1 - side2) > side3 || abs(side1 - side3) > side2 || abs(side3 - side2) > side1)
            throw new IllegalArgumentException("Triangle lengths are incorrect");
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    @Override
    public double calculateArea() {
        double halfPerimeter = this.getPerimeter()/2;
        return sqrt(halfPerimeter *
                (halfPerimeter - this.side1) *
                (halfPerimeter - this.side2) *
                (halfPerimeter - this.side3)
        );
    }

    @Override
    public String getShapeToString() {
        return "Triangle";
    }

    @Override
    public double getPerimeter() {
        return this.side1 + this.side2 + this.side3;
    }
}