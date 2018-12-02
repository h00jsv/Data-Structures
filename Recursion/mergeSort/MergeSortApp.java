package DataStructuresTextbook.Arrays.Chapter6_Recursion.mergeSort;

/**
 * Created by Joakim on 19/03/15.
 */
public class MergeSortApp
{
    public static void main(String args[])
    {
        int maxSize = 100;                 // array size
        DArray arr = new DArray(maxSize);  // create an instance of the class DArray (create the array)

        // insert items
        arr.insert(64);
        arr.insert(21);
        arr.insert(33);
        arr.insert(70);
        arr.insert(12);
        arr.insert(85);
        arr.insert(44);
        arr.insert(3);
        arr.insert(99);
        arr.insert(0);
        arr.insert(108);
        arr.insert(36);

        // display items
        arr.display();

        // mergeSort the array
        arr.mergeSort();

        // display array again
        arr.display();
    }
}
