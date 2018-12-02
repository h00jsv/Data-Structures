package com.joakims.Polymorphism;

public class Main {
    public static void main(String args[]) {

        Animal animal = new Animal();
        Pig pig = new Pig();
        Cow cow = new Cow();

        System.out.println(animal.sound());
        System.out.println(pig.sound());
        System.out.println(cow.sound());
    }
}
