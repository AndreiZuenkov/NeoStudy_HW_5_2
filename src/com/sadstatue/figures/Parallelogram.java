package com.sadstatue.figures;

public class Parallelogram extends Rectangle {

    double alphaAngle;

    public Parallelogram(double a, double b, double alphaAngle) {

        setType("Parallelogram");
        this.a = a;
        this.b = b;
        this.alphaAngle = alphaAngle;
        setLength((a + b) * 2);
        setSquare();
    }

    @Override
    public void setSquare() {
        square = Math.sin(Math.toRadians(alphaAngle))*a*b;
    }

}
