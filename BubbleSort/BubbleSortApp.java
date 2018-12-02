package DataStructuresTextbook.Arrays.Chapter_3.BubbleSort;

/**
 * Created by Joakim on 08/02/15.
 */
public class BubbleSortApp
{
    public static void main(String args[])
    {
        int maxSize = 100; // array size
        ArrayBub arr = new ArrayBub(maxSize); // create ArrayBub object

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

        arr.display(); // display the items

        arr.bubbleSort(); // bubble sort the items

        arr.display(); // display the items again

    } // end main
} // end class BubbleSortApp
