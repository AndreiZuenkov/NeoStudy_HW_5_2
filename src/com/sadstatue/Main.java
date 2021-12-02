package com.sadstatue;

import com.sadstatue.figures.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Point> listOfFigure=new ArrayList<>(){{
            add(new Point());
            add(new Line(10));
            add(new Circle(10));
            add(new Triangle(2,3,4));
            add(new Rectangle(2,3));
            add(new Square(2));
            add(new Parallelogram(2,2,35));
        }};

        for (Point p: listOfFigure
             ) {
            System.out.println("Type: " + p.getType() + ", Length = " + p.getLength() + ", Square = " + p.getSquare());
        }


        //or
//        for (Point p: listOfFigure
//             ) {
//            System.out.println(p);
//        }

    }
}
