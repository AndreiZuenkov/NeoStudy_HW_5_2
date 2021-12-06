package com.sadstatue.figures;

public class Rectangle extends Figure {

    protected Point pointA;
    protected Point pointB;
    protected Point pointC;
    protected Line lineAC;
    protected Line lineBC;

    public Rectangle() {
    }

//    C-----------B
//    |           |
//    |           |
//    A-----------D

    public Rectangle(Point pointA, Point pointB, Point pointC) {
        type = "Rectangle";
        this.pointA = pointA;
        this.pointB = pointB;
        this.pointC = pointC;
        setLength();
        setSquare();

    }


    protected void setLength() {
        lineAC = new Line(pointA, pointC);
        lineBC = new Line(pointB, pointC);
        length = (lineAC.getLength() + lineBC.getLength()) * 2;
    }

    protected void setSquare() {
        square = lineAC.getLength() * lineBC.getLength();
    }


}
