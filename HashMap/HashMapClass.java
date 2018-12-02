package com.joakims;

import java.util.HashMap;
/**
 * - HashMaps are similar to arrays and lists, but they use
 *  key-value pairs and a hashing function to store and
 *  organize data.
 * - Hashing function maps a key or object to a specific hash
 * - This hash determines where the object is stored
 * - As long as you have the key, retrieving the object
 *  is very fast, Big O constant:  O(1)
 *
 *
 * */

public class HashMapClass {
    public static void main(String args[]) {

        HashMap<String, Integer> wordToNumber = new HashMap();

        // insert key-and-value pairs into the HashMap
        wordToNumber.put("ONE", 1);
        wordToNumber.put("TWO", 2);
        wordToNumber.put("THREE", 3);
        wordToNumber.put("FOUR", 4);
        wordToNumber.put("FIVE", 5);

        /**
        //System.out.println(wordToNumber);

        // retrieve element:
        System.out.println(wordToNumber.get("ONE"));

        // list out all values (Integers)
        System.out.println(wordToNumber.values());
        // list out all the keys (Strings)
        System.out.println(wordToNumber.keySet());

        // removing (Note: case-sensitive)
        System.out.println(wordToNumber.remove("FOUR"));
        System.out.println(wordToNumber);

         */

        // Usefulness of HashMaps:
        String string = "phonebook";
        HashMap<Character, Integer> hashMap = new HashMap<>();

        for(int i = 0; i < string.length(); i++) {
            Character currentChar = string.charAt(i);
            if(hashMap.containsKey(currentChar)) {
                // increment current value for this key in HashMap by 1
                hashMap.put(currentChar, hashMap.get(currentChar) + 1);
            } else {
                // if we haven't added it to the HashMap, then put it
                // in with the value 1
                hashMap.put(currentChar, 1);
            }
        }

        // find which character is repeated the most:

        Character mostRepeated = ' ';
        int max = 0;
        for(Character key : hashMap.keySet()) {
            int currentVal = hashMap.get(key);
            if(currentVal > max) {
                mostRepeated = key;
                max = currentVal;
            }
        }

        System.out.println("Most repeated character of string '"
                + string + "' is " + mostRepeated);

    }
}
