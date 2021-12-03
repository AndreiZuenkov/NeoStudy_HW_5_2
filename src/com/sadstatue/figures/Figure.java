package com.sadstatue.figures;

 public abstract class Figure {

    String type;
    double length;
    double square;


     public String getType() {
        return type;
    }

    public double getLength() {
        return length;
    }

    public double getSquare() {
        return square;
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
