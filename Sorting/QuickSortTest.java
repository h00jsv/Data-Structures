package com.joakims.Sorting;

public class QuickSortTest {

    public static void main(String args[]) {

        int maxSize = 16;
        QuickSort q = new QuickSort(maxSize);

        // populate array randomly
        for(int i = 0; i < maxSize; i++) {
            int n = (int)(java.lang.Math.random() * 99);
            q.insert(n);
        }


        q.display();
        q.quickSort();
        System.out.println("");
        q.display();
    }
}
