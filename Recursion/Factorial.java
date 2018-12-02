package DataStructuresTextbook.Arrays.Chapter6_Recursion;

import java.util.Scanner;

/**
 * Created by Joakim on 09/03/15.
 */
public class Factorial
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        int value;

        System.out.print("Enter a number: ");
        value = input.nextInt();

        System.out.println("    Factorial value is: " + factorial(value));
    }
    public static int factorial(int n)
    {
        if(n == 0)          // if base case
            return 1;
        else                // if inductive case (recursive case)
            System.out.printf(n + " * ");
            return ( n * factorial(n-1) );
            // every time (n-1) a new instance of factorial(n) is created
            // and when the base case is reached then (n = ( n(3) * n(2) )...)
    }
}
