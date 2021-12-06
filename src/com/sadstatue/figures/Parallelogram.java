package com.sadstatue.figures;

public class Parallelogram extends Rectangle {


    public Parallelogram(Point pointA, Point pointB, Point pointC) {
        type = "Parallelogram";
        this.pointA = pointA;
        this.pointB = pointB;
        this.pointC = pointC;
        setLength();
        setSquare();
    }

    @Override
    protected void setSquare() {

        Line lineAB = new Line(pointA, pointB);

        double a = lineAC.getLength();
        double b = lineBC.getLength();
        double c = lineAB.getLength();

        double alphaAngle = Math.toDegrees(Math.acos((Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 2)) / (2 * a * b)));

        square = lineAC.getLength() * lineBC.getLength() * (Math.sin(Math.toRadians(alphaAngle)));
    }
}
