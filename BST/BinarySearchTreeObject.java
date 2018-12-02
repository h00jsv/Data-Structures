package com.joakims.BST;

import apple.laf.JRSUIUtils;
/*


public class BinarySearchTreeObject {

    // CONTAINS A REFERENCE ONLY TO THE ROOT NODE!

    private TreeNode root;

    public void insert(Integer data) {
        if (root == null) {                      // if the root is empty,
            this.root = new TreeNode(data);     // create a new Node and insert data
        } else {
            root.insert(data);                  // or, just insert it.
        }

    }

    public TreeNode find(Integer data) {

        // Check if the root is not null, return the requested Node called 'data'
        if (root != null) {
            return root.find(data);
        }

        return null;
    }

    public void delete(Integer data) {

        // DATA IS WHAT WE WANT TO DELETE,
        // CURRENT IS WHAT WE ARE LOOKING AT CURRENTLY

        // iterative approach rather than recursive
        TreeNode current = this.root;
        TreeNode parent = this.root;
        boolean isLeftChild = false;

        // CHECK IF THE ROOT IS EMPTY (THEN THE WHOLE TREE IS EMPTY)
        if (current == null) {
            return;
        }

        // OTHERWISE, IF ROOT IS NOT EMPTY AND ITS VALUE IS NOT EQUAL TO THE DATA VALUE WE WANT TO DELETE,
        while (current != null && current.getData() != data) {
            parent = current;

            // IF WHAT WE WANT TO DELETE IS LESS THAN THE DATA WE'RE LOOKING AT,
            if (data < current.getData()) { 
                // GO TO THE LEFT
                current = current.getLeftChild();
            } else {
                // OTHERWISE, GO TO THE RIGHT
                current = current.getRightChild();
                isLeftChild = false;
            }
        }

        if (current == null) {
            return;
        }
        // IF CURRENT NODE IS A LEAF NODE,
        if(current.getLeftChild() == null && current.getRightChild() == null) {
            if(current == root) {
                root = null;
            } else {
                if(isLeftChild) {
                    parent.setLeftChild(null);
                } else {
                    parent.setRightChild(null);
                }
            }
        }
    }
}

*/