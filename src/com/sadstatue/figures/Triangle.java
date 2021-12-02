package com.sadstatue.figures;

public class Triangle extends Line {

    double square;
    double a, b, c;

    public Triangle(double a, double b, double c) {
        setType("Triangle");
        this.a = a;
        this.b = b;
        this.c = c;
        setLength(a + b + c);
        setSquare();
    }

    private void setSquare() {
        double p=(a+b+c)/2;
        square=Math.sqrt(p*(p-a)*(p-b)*(p-c));
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
