package com.joakims;

public class StringLiterals {

    public static void main(String args[]) {
        // String Literals:
        // String = "abc";

        // string objects:
        // String A = new String("abc);

        String literal = "hello";
        String strObj = new String("hello");
        String otherLiteral = "hello";

        // literal --> "hello"
        // otherLiteral --^

        // however, strObj ----> (references separate string) "hello". Completely separate from the literals above,
        // completely separate in MEMORY.
        // this is important because:

        System.out.println(literal == strObj);              // prints false, b.c. they reference different 'hello' in mem
        System.out.println(literal == otherLiteral);        // prints true, b.c. they reference the same 'hello' in mem
        System.out.println(literal.equals(strObj));
        System.out.println(literal.equals(otherLiteral));

        // use the string instance method.equals() instead of == to compare strings, to avoid the risk of them
        // referencing different locations in memory, and thus returning false.
    }
}
