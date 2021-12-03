package com.sadstatue.figures;

public class Parallelogram extends Rectangle {

    private double alphaAngle;

    public Parallelogram(double a, double b, double alphaAngle) {

        type="Parallelogram";
        this.a = a;
        this.b = b;
        this.alphaAngle = alphaAngle;
        setLength();
    }

    @Override
    public void setSquare() {
        square = Math.sin(Math.toRadians(alphaAngle))*a*b;
    }

}
