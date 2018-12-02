package DataStructuresTextbook.Arrays.Chapter6_Recursion.merge;

import java.util.Scanner;

/**
 * Created by Joakim on 16/03/15.
 */
public class MergeApp
{
    public static void main(String args[])
    {
        int[] arrayA = {23, 47, 81, 95};
        int[] arrayB = {7, 14, 39, 55, 62, 74};
        int[] arrayC = new int[10];

        System.out.print("ArrayA: ");
        for(int n : arrayA)
        {
            System.out.printf("%d, ", n);
        }
            System.out.println(" ");
        System.out.printf("ArrayB: ");
        for(int n : arrayB)
        {
            System.out.printf("%d, ", n);
        }
            System.out.println(" ");
            System.out.println(" ");
        merge(arrayA, 4, arrayB, 6, arrayC);
        System.out.print("ArrayC: ");
        display(arrayC, 10);
    } // end main

    // merge A and B into C
    public static void merge(int[] arrayA, int sizeA, int[] arrayB, int sizeB,
                             int[] arrayC)
    {
        int aDex = 0, bDex = 0, cDex = 0;

        while(aDex < sizeA && bDex < sizeB)     // neither array empty
            if( arrayA[aDex] < arrayB[bDex] )
                arrayC[cDex++] = arrayA[aDex++];
        else
                arrayC[cDex++] = arrayB[bDex++];

        while(aDex < sizeA)                     // arrayB is empty,
            arrayC[cDex++] = arrayA[aDex++];    // but arrayA isn't

        while(bDex < sizeB)                     // arrayA is empty,
            arrayC[cDex++] = arrayB[bDex++];    // but arrayB isn't
    } // end merge

    // display array
    public static void display(int[] theArray, int size)
    {
        for(int j = 0; j < size; j++)
            System.out.print(theArray[j] + " ");
        System.out.println("");
    }
    // put number into array
    public static void addNumber(int n)
    {
        //Scanner scan = input.nextInt();
        int[] a = new int[10];
        System.out.println("Enter a number: ");
    }

} // end class MergeApp
