package DataStructuresTextbook.Arrays.Chapter_3.SelectionSort;

/**
 * Created by Joakim on 12/02/15.
 */
public class ArraySel
{
    private long[] a;  // reference to array a
    private int nElems; // number of data items

    public ArraySel(int max)
    {
        a = new long[max]; // create the array
        nElems = 0; // no items yet
    }

    public void insert(long value) // put elements into array
    {
        a[nElems] = value; // insert it
        nElems++; // increment size
    }

    public void display() // displays array contents
    {
        for(int j = 0; j < nElems; j++) // for each element
            System.out.print(a[j] + " ");  // display it
        System.out.println(" ");
    }

    // the selectionSort() method

    public void selectionSort()
    {
        int out, in, min;

        for(out = 0; out < nElems; out++) // outer loop
        {
            min = out;  // minimum
            for(in = out+1; in < nElems; in++)
                if(a[in] < a[min]) // if min greater
                    min = in;
            swap(out, min); // swap them
        } // end for (out)
    } // end selectionSort()

    private void swap(int one, int two)
    {
        long temp = a[one];
        a[one] = a[two];
        a[two] = temp;
    }


} // end class ArraySel
