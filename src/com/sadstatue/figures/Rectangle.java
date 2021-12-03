package com.sadstatue.figures;

public class Rectangle extends Figure {


    protected double a, b;

    public Rectangle() {
    }

    public Rectangle(double a, double b) {
        type = "Rectangle";
        this.a = a;
        this.b = b;
        setLength();
    }

    protected void setLength() {
        length = (a + b) * 2;
        setSquare();
    }

    public void setSquare() {
        square = a * b;
    }


}
