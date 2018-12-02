package com.joakims;

public class MergeSortApp {

    public static void main(String args[]) {

        // instantiate the two arrays to be merged, and the third array
        int[] arr1 = {1,3,5,7};
        int[] arr2 = {0,2,4,6,8,9};
        int[] mergedArr = new int[10];

        // indices for each array, to keep track of position
        int indexArr1 = 0;
        int indexArr2 = 0;
        int indexMergedArr = 0;

        int sizeArr1 = arr1.length;
        int sizeArr2 = arr2.length;

        System.out.print("Array 1 before sort: ");
        for(int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]);
        }
        System.out.println("");

        System.out.print("Array 2 before sort: ");
        for(int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]);
        }
        System.out.println("");
        /**
        System.out.print("MergedArr before sort: ");
        for(int i = 0; i < mergedArr.length; i++) {
            System.out.print(mergedArr[i]);
        }
        System.out.println("");
         */


        // sort the arrays
        while(indexArr1 < sizeArr1 && indexArr2 < sizeArr2) {
            if(arr1[indexArr1] < arr2[indexArr2]) {
                mergedArr[indexMergedArr++] = arr1[indexArr1++];
            } else {
                mergedArr[indexMergedArr++] = arr2[indexArr2++];
            }
        }

        while(indexArr1 < sizeArr1) {  // while there are still elments left in arr1,
            mergedArr[indexMergedArr++] = arr1[indexArr1++];  // increase index of merged array & copy elements from
                                                              // from arr1 index
        }
        while(indexArr2 < sizeArr2) {
            mergedArr[indexMergedArr++] = arr2[indexArr2++]; // repeat above procedure for arr2
        }

        System.out.println("");
        System.out.print("MergedArr after sort: ");
            for(int i = 0; i < mergedArr.length; i++) {     // print each element of the mergedArr
            System.out.print(mergedArr[i]);
        }
    }

}
