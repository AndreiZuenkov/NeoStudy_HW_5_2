package com.sadstatue.figures;

public class Rectangle extends Line {

    double square;
    double a,b;

    public Rectangle(){};

    public Rectangle(double a, double b) {
        setType("Rectangle");
        this.a=a;
        this.b=b;
        setSquare();
        setLength((a+b)*2);
    }

    public void setSquare() {
        square=a*b;
    }

    @Override
    public double getSquare() {
        return square;
    }

    @Override
    public String toString() {
        return "Figure{" +
                "type=" + type +
                ", length='" + length + '\'' +
                ", square=" + square +
                '}';
    }
}
