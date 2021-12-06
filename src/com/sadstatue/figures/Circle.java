package com.sadstatue.figures;

public class Circle extends Figure {

    private Point centerPoint;
    private Point pointOnCircle;
    private Line radius;


    public Circle(Point centerPoint, Point pointOnCircle) {
        type = "Circle";
        this.centerPoint = centerPoint;
        this.pointOnCircle = pointOnCircle;
        setRadius();

    }

    public Circle(Point centerPoint, Line radius) {
        type = "Circle";
        this.radius = radius;
        setLength();
    }

    private void setRadius() {
        radius = new Line(centerPoint, pointOnCircle);
        setLength();
    }

    private void setSquare() {
        square = (Math.PI * Math.pow(radius.getLength(), 2));
    }

    private void setLength() {
        length = Math.PI * radius.getLength() * 2;
        setSquare();
    }

}
