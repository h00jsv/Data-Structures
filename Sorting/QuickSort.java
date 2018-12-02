package com.joakims.Sorting;

/**
 * Worst Case: O(n^2)
 * Best Case:
 *
 * Average Case: O(n log n)
 * Advantage: in-place sorting. Does not require extra memory space.
 *
 * Partition-algorithm: select a pivot. place all items < pivot on its left side, and all elements > pivot
 * on its right hand side. This alogorithm can then be applied recursively to both the LHS and to the RHS respectively,
 * and so forth, until all elements in the sub-arrays are sorted.
 *
 * */

public class QuickSort {

    private int[] arr;
    private int nElems;

    public QuickSort(int max) {
        arr = new int[max];     // create the array,
        nElems = 0;             // no elements yet.
    }

    public void insert(int value) {
        arr[nElems] = value;
        nElems++;
    }

    public void display() {
        System.out.print("Array: ");
        for(int i = 0; i < nElems; i++) {   // for each element of the array,
            System.out.print(arr[i] + " "); // display it
        }
        System.out.println("");
    }

    public void quickSort() {
        recQuickSort(0, nElems-1);
    }

    public void recQuickSort(int left, int right) {
        if(right - left <= 0) {
            // if size is 0 or less, base case hit, so
            // we just return.
            return;
        } else {
            int pivot = arr[right];  // select right-most item in arr as pivot
            // partition range:
            int partition = partitionIt(left, right, pivot);

            recQuickSort(left, partition-1);  // sort LHS
            recQuickSort(partition+1, right);  // sort RHS
        }
    }

    // partition method!
    public int partitionIt(int left, int right, int pivot) {
        int leftPtr = left-1;
        int rightPtr = right;

        while(true) {
            // find the larger item:
            while(arr[++leftPtr] < pivot)
                    ;
            while(rightPtr > 0 && arr[--rightPtr] > pivot)
                ;

            // if the pointers cross paths,
            if(leftPtr >= rightPtr) {
                break;
            } else {
                swap(leftPtr, rightPtr);  // else, swap them
            }
        }
        swap(leftPtr, right);
        return leftPtr;
    }

    public void swap(int temp1, int temp2) {
        int temp = arr[temp1];
        arr[temp1] = arr[temp2];
        arr[temp2] = temp;
    }


}
