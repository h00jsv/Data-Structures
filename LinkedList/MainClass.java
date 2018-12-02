package com.joakims.LinkedList;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 * LinkedList included in Java 7
 * Access to elements is linear
 * It uses a doubly linked list to manage the collection of objects
 *
 *
 * */

public class MainClass {

    public static void main(String args[]) {

        LinkedList states = new LinkedList();
        states.add("Alaska");
        states.add("Arizona");
        states.add("Arkansas");
        states.add("California");
        states.add("Colorado");
        states.add("Connecticut");

        System.out.println(states);

        states.addFirst("Alabama");  // adding object to beginning of linkedlist
        System.out.println(states);

        states.addLast("Hawaii");  // append to the end of states
        System.out.println(states);

        states.add(1, "Wyoming");  // will add object to position 1, and push everything one index to the right
        System.out.println(states);

        System.out.println(states.getLast());  // will only print the last object of the list

        // ListIterator object that will iterate through the list, here backwards, as long as there are previous elements
        ListIterator iterator = states.listIterator(states.size());
        while(iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }


    }
}
