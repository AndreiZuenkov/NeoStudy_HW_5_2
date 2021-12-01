package com.sadstatue.figures;

public class Circle extends Line {

    private double square;

    public Circle(double circumference) {
        setType("circle");
        setLength(circumference);
        setSquare(circumference);
    }

    @Override
    public double getSquare() {
        return square;
    }

    private void setSquare(double circumference) {
        square = (Math.pow(circumference, 2)) / (4 * Math.PI);
    }
}
