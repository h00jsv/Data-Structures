package com.joakims;

public class StringInterview {

    public static void main(String args[]) {

        String p = "   Panda";
        String f = " Fish ";
        String h = "Horse   ";
        String c = "  Cat";
        String empty = "";
        String[] strings = {p, f, h, c, empty};

        for(String s : strings) {
            // trim strings to get rid of space before/after
            System.out.println(s);
            s = s.trim();
            System.out.println(s);

            // print only non-empty strings
            // check if contain characters,
            if(!s.isEmpty()) {
                System.out.println("Not empty: " + s);
            }

            // Prints strings >3 characters in length
            if(s.length() > 3) {
                System.out.println("More than 3: " + s);
            }

            // print lower cased (not modifying the original string, just creating a new representation for print)
            System.out.println(s.toLowerCase());
            System.out.println(s.toUpperCase());

        }
    }
}
