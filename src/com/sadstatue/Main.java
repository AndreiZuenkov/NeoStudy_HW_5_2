package com.sadstatue;

import com.sadstatue.figures.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Point groundPoint = new Point(0, 0);

        List<Figure> figures = new ArrayList<>() {{
            add(groundPoint);
            add(new Line(groundPoint, new Point(2, 3)));
            add(new Circle(groundPoint, new Point(5, 0)));
            add(new Triangle(groundPoint, new Point(0, 5), new Point(2, 5)));
            add(new Rectangle(groundPoint, new Point(5, 4), new Point(0, 4)));
            add(new Square(groundPoint, new Point(5, 5), new Point(0, 5)));
            add(new Parallelogram(groundPoint, new Point(5, 5), new Point(1, 5)));

        }};

        for (Figure f : figures
        ) {
            System.out.println("Type: " + f.getType() + ", length= " + f.getLength() + ", square= " + f.getSquare());
//            or
//            System.out.println(f);
        }

    }
}
