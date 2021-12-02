package com.sadstatue.figures;

public class Line extends Point {

    double length;

    public Line() {
    }

    public Line(double length) {
        type="Line";
        this.length = length;
    }

    @Override
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
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
