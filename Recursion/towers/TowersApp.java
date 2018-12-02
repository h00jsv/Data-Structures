package DataStructuresTextbook.Arrays.Chapter6_Recursion.towers;

/**
 * Created by Joakim on 15/03/15.
 */
public class TowersApp
{
    static int nDisks = 4;

    public static void main(String args[])
    {
        doTowers(nDisks, 'A', 'B', 'C');
    }

    public static void doTowers(int n, char from,
                                    char inter, char to)
    {
        if(n == 1)
            System.out.println("Disk 1 from " + from + " to " + to);
        else
        {
            doTowers(n-1, from, to, inter);      // from --> inter

            System.out.println("Disk " + n + " from " + from
                                                + " to " + to);
            doTowers(n-1, inter, from, to);     // inter --> to
        }
    }
} // end class TowersApp
