package com.sadstatue.figures;

public class Square extends Rectangle {

    public Square(double c) {
        setType("Square");
        a=b=c;
        setLength(a*4);
        setSquare();
    }
}
