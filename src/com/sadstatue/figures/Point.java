package com.sadstatue.figures;

public class Point extends Figure {


    private final double length = 0;
    protected final double square = 0;

    public Point() {
        type = "Point";

    }

    public double getLength() {
        return length;
    }

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
