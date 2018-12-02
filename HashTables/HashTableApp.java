package DataStructuresTextbook.Arrays.Chapter_11_HashTables;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Joakim on 08/06/15.
 */
public class HashTableApp
{
    public static void main(String args[]) throws IOException
    {
        DataItem aDataItem;
        int aKey, size, n, keysPerCell;

        // get sizes
        System.out.print("Enter size of hash table: ");
        size = getInt();
        System.out.print("Enter initial number of items: ");
        n = getInt();
        keysPerCell = 10;

        // make table
        HashTable theHashTable = new HashTable(size);

        // insert data
        for(int j = 0; j < n; j++)
        {
            aKey = (int)(java.lang.Math.random() *
            keysPerCell * size);
            aDataItem = new DataItem(aKey);
            theHashTable.insert(aDataItem);
        }
        // interact with user
        while(true)
        {
            System.out.print("Enter first letter of ");
            System.out.print("show, insert, delete, or find: ");
            char choice = getChar();
            switch(choice)
            {
                case 's':
                    theHashTable.displayTable();
                    break;
                case 'i':
                    System.out.print("Enter key value to insert: ");
                    aKey = getInt();
                    aDataItem = new DataItem(aKey);
                    theHashTable.insert(aDataItem);
                    break;
                case 'd':
                    System.out.print("Enter key value to delete: ");
                    aKey = getInt();
                    theHashTable.delete(aKey);
                    break;
                case 'f':
                    System.out.print("Enter key value to find: ");
                    aKey = getInt();
                    aDataItem = new DataItem(aKey);
                    if(aDataItem != null)
                    {
                        System.out.println("Found " + aKey);
                    }
                    else
                    {
                        System.out.println("Didn't find " + aKey);
                    }
                    break;
                case 'q':
                    System.exit(1);
                    break;
                default:
                    System.out.print("Invalid entry\n");
            } // end switch
        } // end while
    } // end main()

    public static String getString() throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }
    public static char getChar() throws IOException
    {
        String s = getString();
        return s.charAt(0);
    }
    public static int getInt() throws IOException
    {
        String s = getString();
        return Integer.parseInt(s);
    }
} // end class HashTableApp
