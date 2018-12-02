package com.joakims.BST;

/**
 * SEARCH, INSERT, AND DELETE ALL TAKE O(logN)
 *
 * Binary Tree: means that a Tree can have AT MOST TWO CHILD NODES
 *
 * Binary SEARCH Tree:  SPECIFIES THAT ALL THE ELEMENTS ON THE LEFT HAND SIDE OF THE ROOT ARE SMALLER THAN THE ROOT,
 *                      AND ALL THE ELEMENTS ON THE RHS ARE LARGER THAN THE ROOT.
 *                      NOTE THAT THIS IS FURTHER PROPAGATED DOWN FOR EACH CHILD NODE!
 *
 *

public class BinarySearchTree {

    public static void main(String args[]) {

        BinarySearchTreeObject bst = new BinarySearchTreeObject();
        bst.insert(5);
        bst.insert(3);
        bst.insert(10);

        //System.out.println(bst);
        //System.out.println(bst.find(3));

    }
}
 */