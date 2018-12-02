package com.joakims.Abstraction;

public class Rectangle extends Shape{

    private double length;
    private double width;

    public Rectangle(String color, double length, double width) {
        super(color); // inherited from the superclass Shape. Don't forget to extend the superclass
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return (length * width);
    }

    public String draw() {
        return "A " + getColor() + " rectangle " + length + " cm long and " + width + " cm wide.";
    }



}
