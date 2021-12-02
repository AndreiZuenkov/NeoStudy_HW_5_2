package com.sadstatue.figures;

public class Circle extends Line {

    double square;
    double diameter;

    public Circle(double diameter) {
        setType("Circle");
        this.diameter=diameter;
        setLength();
        setSquare();
    }

    @Override
    public double getSquare() {
        return square;
    }

    private void setSquare() {
        square = (Math.PI*Math.pow(diameter,2)*0.25);
    }

    public void setLength(){

        super.setLength(Math.PI*diameter);
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
