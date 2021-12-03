package com.sadstatue.figures;

public class Point extends Figure {

    private double x;
    private double y;
    private final double length = 0;
    protected final double square = 0;


    public Point(double x,double y){
        type = "Point";
        this.x=x;
        this.y=y;
    }

    public double getLength() {
        return length;
    }

    public double getSquare() {
        return square;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
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
