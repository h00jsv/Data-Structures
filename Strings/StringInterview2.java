package com.joakims;

public class StringInterview2 {

    public static String reverseString(String string) {
        StringBuilder stringBuilder = new StringBuilder();

        // start from end of string and work backwards
        for(int i = string.length()-1; i >= 0; i--) {
            stringBuilder.append(string.charAt(i));
        }

        return stringBuilder.toString();
    }

    public static void main(String args[]) {

        String a = "Apples";
        String b = "Bananas";
        String o = "Oranges";
        String bp = "Banana Peels";
        String p = "Pears";
        String palindrome = "amanap lanac a nalp a nam a";
        String[] fruits = {a,b,o,bp,p, palindrome};

        for(String f : fruits) {
            System.out.println(f);

            // get a character at a specific index
            int index = 1;
            System.out.println(f.charAt(1)); // will return character at index 1

            // another way to perform the above
            char[] charArray = f.toCharArray();
            System.out.println("Char at " + index + " : " + charArray[index] );

            // get index of first 'e' of a string
            int indexOfLetterE = f.indexOf('e');
            System.out.println(indexOfLetterE);

            // print a string if it contains a substring
            // using the contains() method
                // first we normalize our input by using only lowercase
            f = f.toLowerCase();  // because 'App' would just return false
            if(f.contains("app")) {
                System.out.println("Contains app: " + f);
            }


            // grab a substring using two indexes
            System.out.println(f.substring(1,4));   // Does not include index 4


            // print a reverse string
            // no default method, so we'll create one
            System.out.println(reverseString(f));

            System.out.println();

        }
    }
}
