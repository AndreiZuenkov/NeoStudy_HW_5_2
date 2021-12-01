package com.sadstatue;

import com.sadstatue.figures.Circle;
import com.sadstatue.figures.Line;

public class Main {

    public static void main(String[] args) {

        Line line = new Line(10);
        System.out.println(line.getLength() + " " + line.getType() + " " + line.getSquare());

        Circle circle = new Circle(150);

        System.out.println(circle.getLength() + " " + circle.getType() + " " + circle.getSquare());
    }
}
