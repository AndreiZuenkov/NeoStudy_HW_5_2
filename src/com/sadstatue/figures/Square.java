package com.sadstatue.figures;

public class Square extends Rectangle {

    public Square(Point pointA, Point pointB, Point pointC) {
        type = "Square";
        this.pointA = pointA;
        this.pointB = pointB;
        this.pointC = pointC;
        checkFigure();
    }

    private void checkFigure() {
        setLength();
        if (lineAC.getLength() == lineBC.getLength() && checkSquare()) {
            setSquare();
        } else {
            System.out.println("Точки введены не верно. Данная фигура не квадрат");
        }
    }

    private boolean checkSquare() {
        Line lineAB = new Line(pointA, pointB);

        return Math.sin(Math.toRadians(45)) == (lineAC.getLength() / lineAB.getLength());
    }
}
