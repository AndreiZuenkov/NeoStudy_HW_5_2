package com.sadstatue.figures;

public class Line extends Figure {


    private final double square = 0;


    public Line(double length) {
        type = "Line";
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
