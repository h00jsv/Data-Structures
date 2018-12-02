package com.joakims.Stack;

import java.util.ArrayList;
import java.util.List;

public class GroceryListChallenge {

    public static void main(String args[]) {

        // create 2 ArrayLists of grocery items
        List<String> groceries1 = new ArrayList<>();
        groceries1.add("Bread");
        groceries1.add("Butter");
        groceries1.add("Milk");

        List<String> groceries2 = new ArrayList<>();
        groceries2.add("Lettuce");
        groceries2.add("Pasta");
        groceries2.add("Cheese");

        // add groceries2 to groceries1
        groceries1.addAll(groceries2);

        System.out.println(groceries1);

        for(int i = 0; i < groceries1.size(); i++) {  // iterate through groceries1,
            if(groceries1.get(i).contains("Pasta")) {  // for each index of i, if groceries1 contains "Pasta",
                groceries1.remove(i);           // remove it.
            }
        }
        System.out.println(groceries1);


        // Alternative solution for removing:
        if(groceries1.contains("Lettuce")) {
            groceries1.remove("Lettuce");
        }

        System.out.println(groceries1);
    }
}
