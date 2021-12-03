package com.sadstatue;

import com.sadstatue.figures.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Figure> listOfFigure=new ArrayList<>(){{
            add(new Point());
            add(new Line(10));
            add(new Circle(10));
            add(new Triangle(2,3,4));
            add(new Rectangle(2,3));
            add(new Square(2));
            add(new Parallelogram(2,2,90));
        }};

        for (Figure f: listOfFigure
             ) {
            System.out.println("Type: " + f.getType() + ", Length = " + f.getLength() + ", Square = " + f.getSquare());
        }


        //or
        for (Figure f: listOfFigure
             ) {
            System.out.println(f);
        }



    }
}
