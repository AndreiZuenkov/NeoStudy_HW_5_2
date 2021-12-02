package com.sadstatue.figures;

public class Point {

    String type;
    final double length = 0;
    final double square = 0;

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

    @Override
    public String toString() {
        return "Figure{" +
                "type=" + type +
                ", length='" + length + '\'' +
                ", square=" + square +
                '}';
    }
}
