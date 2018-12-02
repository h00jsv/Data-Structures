package com.joakims.Abstraction;

/**
 * Abstract class => Template class for how we want the different shape classes to be.
 * They will extend the Shape class.
 *
 * Note: we cannot create a class of Shape like this:  Shape shape = new Shape(); since its an abstract class, but
 * we can do this:   Shape shape = new Circle(); for instance.
 *
 * */

public abstract class Shape {
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    abstract double getArea();
    abstract String draw();
}
