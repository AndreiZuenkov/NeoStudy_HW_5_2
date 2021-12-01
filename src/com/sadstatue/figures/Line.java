package com.sadstatue.figures;

public class Line extends Point {

    private double length;

    public Line() {
    }

    public Line(double length) {
        setType("line");
        this.length = length;
    }

    @Override
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
}
