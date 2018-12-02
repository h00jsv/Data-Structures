package com.joakims;

import java.util.LinkedList;
import java.util.Queue;

public class QueueClass {

    public static void main(String args[]) {

        // create the queue
        Queue<String> queue = new LinkedList<>();

        // enqueue items
        queue.add("Sam");
        queue.add("Anna");
        queue.add("Heidi");
        queue.add("Susan");
        queue.add("Charlotte");

        System.out.println(queue);

        String nextInQueue = queue.peek();
        System.out.println(nextInQueue);

        for(int i = 0; i < queue.size(); i++) {
            // note, do not say remove(i) here
            queue.remove();
            // after each iteration, print the queue
            System.out.println(queue);
        }
    }
}
