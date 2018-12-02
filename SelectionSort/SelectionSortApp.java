package DataStructuresTextbook.Arrays.Chapter_3.SelectionSort;

/**
 * Created by Joakim on 12/02/15.
 */
public class SelectionSortApp
{
    public static void main(String args[])
    {
        int maxSize = 100; // array size
        ArraySel arr = new ArraySel(maxSize); // instantiate object of class ArraySel

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

        arr.display(); // display items

        arr.selectionSort(); // selection-sort them

        arr.display(); // display items again
    }
} // end class SelectionSortApp
