package com.joakims;

/**
 * 1. Find the number of vowels and consonants in a given string
 *
 * 2. Create a method that takes a string input and prints out the number vowels and the number
 *      of consonants in that string input
 *
 *  Assume the string will only contain letters and whitespace
 *
 *  Vowels: a, o, e, i, u, y
 *
 *  Use: toCharArray(), atChar()
 *
 *  Test:   "HellO" <-- 2 vowels, 3 consonants
 *          " there is a quiet Mouse" <--- 10 vowels, 8 consonants
 *          "I am happy   " <--- 4 vowels, 4 consonants
 * */

public class StringChallenge {

    public static void findNumberOfVowelsAndConsonants(String input) {
        int vowelsCount = 0;
        int consonantsCount = 0;
        String vowels = "aoeiuy";
        String normalized = (input.toLowerCase()).trim();

        char[] inputCharArray = normalized.toCharArray();

        for(char c : inputCharArray) {
            if(vowels.indexOf(c) != -1) {
                vowelsCount++;
            } else if(c != ' ') {
                consonantsCount++;
            }
        }

        System.out.println("There are " + vowelsCount + " vowels in " + input);
        System.out.println("There are " + consonantsCount + " consonants in " + input);
        System.out.println();
    }

    public static void main(String args[]) {

        String s1 = "HellO";
        String s2 = " there is a quiet Mouse";
        String s3 = "I am happy  ";

        findNumberOfVowelsAndConsonants(s1);
        findNumberOfVowelsAndConsonants(s2);
        findNumberOfVowelsAndConsonants(s3);


    }
}
