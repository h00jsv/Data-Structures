package com.joakims.BST;

public class TreeNode {

    private Integer data;
    private TreeNode leftChild;
    private TreeNode rightChild;

    public TreeNode(Integer data) {
        this.data = data;
    }

    public Integer getData() {
        return data;
    }

    // NOTE: WE DO NOT PROVIDE A setData member (SETTER FOR THE DATA MEMBER)), BECAUSE WE WILL SET THE DATA
    // THROUGH THE CONSTRUCTOR, AND ONCE SET, THERE IS NO NEED TO CHANGE IT!
    // IMMUTABLE OBJECTS ARE GOOD PRACTICE

    public TreeNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(TreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public TreeNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(TreeNode rightChild) {
        this.rightChild = rightChild;
    }

    // implement the search method:
    public TreeNode find(Integer data) {
        if(this.data == data) {
            return this;
        }
        if(data < this.data && leftChild != null) {
            return leftChild.find(data);  // call recursive search on the Left
                    // Note, that if leftChild is null, and we don't check for this, we will get a NullPointerException,
                            // so we add the condition  (&& leftChild != null)
        }
        if(data > this.data && rightChild != null) {
            return rightChild.find(data);
        }
        return null;  // this means, no TreeNode was found that matches 'data'
    }

    // INSERT METHOD IN THE TREENODE CLASS
    public void insert(Integer data) {

        // CHECK IF DATA SHOULD GO ON THE RIGHT HAND SIDE....

        if(data >= this.data) {             // if data to insert is greater or equal to current Node,
            if(this.rightChild == null) {    // if the rightChild is empty,
                this.rightChild = new TreeNode(data); // create a new child Node and insert the data
            } else {                            // otherwise,
                this.rightChild.insert(data);   // just insert the data to the rightChild Node recursively.
            }


         // OR IF IT SHOULD GO ON THE LEFT HAND SIDE....

        } else {
            if(this.leftChild == null) {
                this.leftChild = new TreeNode(data);
            } else {
                this.leftChild.insert(data); // insert the data recursively
            }

        }
    }


}
