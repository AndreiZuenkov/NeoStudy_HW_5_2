package com.sadstatue.figures;

public class Rectangle extends Figure {


    protected double a, b;

    private Point pointA;
    private Point pointB;
    private Point pointC;
    private Line lineAC;
    private Line lineBC;

    public Rectangle() {
    }

//    C-----------B
//    |           |
//    |           |
//    A-----------D


    public Rectangle(Point pointA, Point pointB) {
        type = "Rectangle";
        this.pointA = pointA;
        this.pointB = pointB;
        calculatePointC();

    }

    public Rectangle(Point pointA, Point pointB, Point pointC) {
        type = "Rectangle";
        this.pointA = pointA;
        this.pointB = pointB;
        this.pointC = pointC;
        setLength();

    }

    private void calculatePointC() {

    }

    protected void setLength() {
        lineAC = new Line(pointA, pointC);
        lineBC = new Line(pointB, pointC);
        length=(lineAC.getLength()+lineBC.getLength())*2;
        setSquare();
    }

    public void setSquare() {
        square = lineAC.getLength()*lineBC.getLength();
    }


}
