package com.sadstatue.figures;

public class Line extends Figure {

    private Point point1;
    private Point point2;
    private final double square = 0;


    public Line(double length) {
        type = "Line";
        this.length = length;

    }

    public Line(Point point1, Point point2) {
        type = "Line";
        this.point1=point1;
        this.point2=point2;
        setLength();
    }

    private void setLength() {
        length=Math.sqrt(Math.pow((point2.getX()-point1.getX()),2)+Math.pow((point2.getY()-point1.getY()), 2));
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
