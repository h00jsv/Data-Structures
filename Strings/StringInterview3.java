package com.joakims;

public class StringInterview3 {

    public static void main(String args[]) {

        // Split String instance method

        String text = "In the English language, sentences are broken up by a period. This means Split can break our string " +
                "into individual sentences, splitting on the dot characters in the text. The output will be an array with each " +
                "entry being a sentence. The length of the array will be the number of sentences in the text. Going back to the " +
                "code, we can write this out. So, we'll want to find out how many sentences. And, to do this, we'll create " +
                "a string array, which will hold all of our sentences, and then we're going to use that Split method.";

        // Find out "how many sentences" ?


        String[] sentences = text.split("\\.");  // sentences are separated by periods
        System.out.println("The text has " + sentences.length + " sentences.");

        // how many words?
        String[] words = text.split(" ");  // words are separated by spaces
        System.out.println("The text has " + words.length + " words.");

        // how many characters?
        // find the length of the text string will be the # of characters
        System.out.println(text.length());

        // how do we replace "language" with "pie"?
        String printModifier = text.replace("language", "pie");   // target, replacement
        System.out.println(text);               // original text
        System.out.println(printModifier);      // modified text
    }
}
