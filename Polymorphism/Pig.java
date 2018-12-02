package com.joakims.Polymorphism;


// since Pig is of type Animal, it may extend it!
public class Pig extends Animal {


    // Override note is used to show that we're overriding the superclass's method sound()
    @Override
    public String sound() {
        return "Oink!";
    }

}
