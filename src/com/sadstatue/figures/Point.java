package com.sadstatue.figures;

public class Point {

    private String type;
    private final double length = 0;
    private final double square = 0;

    public Point() {
        setType("Point");
    }

    public double getLength() {
        return length;
    }

    public String getType() {
        return type;
    }

    public double getSquare() {
        return square;
    }

    public void setType(String type) {
        this.type = type;
    }
}
