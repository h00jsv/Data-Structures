package com.joakims;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * LinkedList is the standard Queue implementation
 *
 * You must instantiate a concrete implementation
 * of the interface in order to use it
 *
 * - Good for storing order of processes
 * - Enqueue/dequeue takes very little time
 * - Only advantageous to use this data structure
 *      when you want to use it in a manner where
 *      the First Item In is the First Item Out (FIFO)
 *
 *  QUEUE IMPLEMENTATION BELOW
 *
 * */

public class QueueInterface {

    public static void main(String args[]) {

        Queue<String> queue = new LinkedList<>();

        queue.add("Sam");
        queue.add("Heidi");
        queue.add("Anna");
        queue.add("Susan");
        queue.add("Charlotte");

        System.out.println(queue); // prints queue from first to last element

        String nextInQueue = queue.peek();
        System.out.println("Next up: " + nextInQueue);

        queue.remove(); // removes the first element
        System.out.println(queue);

        /*
        // remove all elements from queue using loop
        for(int i = 0; i < queue.size(); i++) {
            queue.remove();
            System.out.println(queue);
        }
        */

        String recentlyRemoved = queue.remove();
        System.out.println("Recently removed " + recentlyRemoved);
        System.out.println(queue);

    }
}
