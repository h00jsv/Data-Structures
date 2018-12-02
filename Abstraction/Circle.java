package com.joakims.Abstraction;

public class Circle extends Shape {

    private double radius;
    private static final double PI = 3.14159265359;

    public Circle(String color, double radius) {
        super(color);
        this.radius  = radius;
    }

    public double getArea() {
        return (radius * radius) * PI;
    }

    public String draw() {
        return "A " + getColor() + " circle " + radius + " cm radius, giving an area of " + getArea() +" cm^2";
    }

}
