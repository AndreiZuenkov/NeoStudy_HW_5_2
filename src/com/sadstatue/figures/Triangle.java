package com.sadstatue.figures;

public class Triangle extends Figure {

    private double a, b, c;

    public Triangle(double a, double b, double c) {
        type = "Triangle";
        this.a = a;
        this.b = b;
        this.c = c;
        setLength();
    }

    private void setLength() {
        length = a + b + c;
        setSquare();
    }

    private void setSquare() {
        double p = (a + b + c) / 2;
        square = Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

}
