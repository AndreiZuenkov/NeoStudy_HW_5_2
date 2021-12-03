package com.sadstatue.figures;

public class Circle extends Figure {

    private double diameter;

    public Circle(double diameter) {
        type = "Circle";
        this.diameter = diameter;
        setLength();

    }

    private void setSquare() {
        square = (Math.PI * Math.pow(diameter, 2) * 0.25);
    }

    private void setLength() {
        length = Math.PI * diameter;
        setSquare();
    }

}
