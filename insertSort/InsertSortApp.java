package DataStructuresTextbook.Arrays.Chapter_3.insertSort;

/**
 * Created by Joakim on 12/02/15.
 */
public class InsertSortApp
{
    public static void main(String args[])
    {
        int maxSize = 100; // size of the array
        ArrayIns arr = new ArrayIns(maxSize); // create an object of class ArrayIns

        // insert 10 items
        arr.insert(77);
        arr.insert(99);
        arr.insert(44);
        arr.insert(55);
        arr.insert(22);
        arr.insert(88);
        arr.insert(11);
        arr.insert(00);
        arr.insert(66);
        arr.insert(33);
        arr.insert(1);
        arr.insert(2);
        arr.insert(3);
        arr.insert(4);
        arr.insert(5);
        arr.insert(6);
        arr.insert(7);
        arr.insert(8);
        arr.insert(9);
        arr.insert(10);

        arr.display(); // display items in the array

        arr.insertionSort(); // insertion-sort them

        arr.display(); // display them again

    } // end main
} // end class InsertSortApp
