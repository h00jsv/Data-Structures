package com.joakims.Abstraction;

import org.w3c.dom.css.Rect;

public class ShapeTester {
    public static void main(String args[]) {

        Rectangle rectangle = new Rectangle("Yellow", 10, 15);
        Circle circle = new Circle("Black", 6);
        Shape s = new Rectangle("Green", 5, 2);

        System.out.println("Rectangle area: " + rectangle.getArea());
        System.out.println("Circle area: " + circle.getArea());

        System.out.println(rectangle.draw());
        System.out.println(circle.draw());
        System.out.println(s.draw());
    }
}
