package com.joakims.Stack;

import java.util.LinkedList;
import java.util.Queue;

/**
 * useful for simulating First In First Out-order (FIFO)
 *
 * add(), peek(), remove(), poll(): removes from top, returns null if queue is empty
 * */

public class QueueExample {

    public static void main(String args[]) {

        // Note: queue is abstract, a TYPE must therefore be specified!
       //   Queue queue = new Queue();      WILL NOT WORK

        // instead, we instantiate the queue as a LinkedList
        Queue<Integer> queue = new LinkedList<>();

        // add integers 1-20 to the queue
        for(int i = 1; i <= 20; i++) {
            queue.add(i);
        }

        System.out.println("Elements in the queue: " + queue);  // prints out the entire queue

        // remove the top element
        queue.remove();  // removes element 1
        System.out.println("Elements in the queue: " + queue);


    }
}
