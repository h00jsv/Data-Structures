package DataStructuresTextbook.Arrays.Chapter_11_HashTables;

/**
 * Created by Joakim on 08/06/15.
 */
public class DataItem
{
    // (could have more data)

    private int iData; // data item (key)

    // default constructor
    public DataItem(int ii)
    {
        iData = ii;
    }
    public int getKey()
    {
        return iData;
    }
} // end class DataItem
