package com.sadstatue.figures;

public class Triangle extends Rectangle {

    private Line lineAB;

    public Triangle(Point pointA, Point pointB, Point pointC) {
        type = "Triangle";
        this.pointA = pointA;
        this.pointB = pointB;
        this.pointC = pointC;
        setLength();
    }

    protected void setLength() {
        lineAC = new Line(pointA, pointC);
        lineBC = new Line(pointB, pointC);
        lineAB = new Line(pointA, pointB);
        length = lineAC.getLength() + lineBC.getLength() + lineAB.getLength();
        setSquare();
    }

    protected void setSquare() {
        double a = lineAC.getLength();
        double b = lineBC.getLength();
        double c = lineAB.getLength();
        square = Math.sqrt((length / 2) * ((length / 2) - a) * ((length / 2) - b) * ((length / 2) - c));
    }

}
