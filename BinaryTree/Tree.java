package DataStructuresTextbook.Arrays.Chapter_8_BinaryTrees.treeProgram2;

import java.util.Stack;

/**
 * Created by Joakim on 05/05/15.
 */
class Tree
{
    private Node root;          // first node of the tree

    // constructor
    public Tree()
    {
        root = null;        // no nodes in tree yet
    }

    // find node with given key
    public Node find(int key)
    {
        // assumes non-empty tree
        Node current = root;                    // start at root,
        while(current.iData != key)             // while no match,
        {
            if(key < current.iData)             // go left?
                current = current.leftChild;
            else
                current = current.rightChild;   // or go right?
            if(current == null)                 // if there's no child,
                return null;                    // didn't find it

        }
        return current;                         // found it!
    } // end find()

    public void insert(int id, double dd)
    {
        Node newNode = new Node();      // create new node
        newNode.iData = id;             // insert data
        newNode.dData = dd;

        if(root == null)                // node node in root,
            root = newNode;             // make new root
        else                            // if root occupied,
        {
            Node current = root;        // start at root,
            Node parent;
            while(true)                 // (exits internally)
            {
                parent = current;
                if(id < current.iData)              // go left?
                {
                    current = current.leftChild;    // tell it to go left
                    if(current == null)             // if end of the line,
                    {
                        parent.leftChild = newNode; // insert new node ON LEFT
                        return;
                    }
                } // end if go left
                else                                // or go right?
                {
                    current = current.rightChild;   // tell it to go right
                    if(current == null)             // if end of the line,
                    {
                        parent.rightChild = newNode;// insert new node ON RIGHT
                        return;
                    }
                } // end else go right
            } // end while
        } // end else not root
    } // end insert()

    // delete node w/ given key
    public boolean delete(int key)
    {
        // assumes non-empty list
        Node current = root;
        Node parent = root;
        boolean isLeftChild = true;

        // :: search part of the method below ::

        while(current.iData != key)     // search for key node
        {
            parent = current;
            if(key < current.iData)     // go left?
            {
                isLeftChild = true;
                current = current.leftChild;
            }
            else
            {
                isLeftChild = false;
                current = current.rightChild;
            }
            if(current == null)     // if end of the line,
                return false;       // didn't find it
        } // end while
        // :: search part of the method above ::
        // found note to delete
        // if no children, simply delete it
        if(current.leftChild == null && current.rightChild == null)
        {
            if(current == root)         // if root,
                root = null;            // tree is now empty
            else if(isLeftChild)             // if it is the left child,
                parent.leftChild = null;    // disconnect it from its parent
            else                            // or if it is the right child,
                parent.rightChild = null;   // disconnect it from its parent
        }

        // if no right child, replace with LEFT SUBTREE
        else if(current.rightChild == null)
            if(current == root)
                root = current.leftChild;
        else if(isLeftChild)
                parent.leftChild = current.leftChild;
        else
                parent.rightChild = current.leftChild;

        // if no right child, replace with RIGHT SUBTREE
        else if(current.leftChild == null)
            if(current == root)
                root = current.rightChild;
        else if(isLeftChild)
                parent.leftChild = current.rightChild;
        else
                parent.rightChild = current.rightChild;

        // it has two children, so REPLACE WITH INORDER SUCCESSOR
        else
        {
            // get successor of node to delete (current)
            Node successor = getSuccessor(current);

            // connect the parent of current to successor instead
            if(current == root)
                root = successor;
            else if(isLeftChild)
                parent.leftChild = successor;
            else
                parent.rightChild = successor;

            // connect successor to current's LEFT CHILD
            successor.leftChild = current.leftChild;
        } // end 'else two children'
        // (successor cannot have a left child)
        return true;            // success!
    } // end delete()

    // returns node with next-highest value after delNode
    // goes to right child, then right child's left descendents
    private Node getSuccessor(Node delNode)
    {
        Node successorParent = delNode;
        Node successor = delNode;
        Node current = delNode.rightChild;      // go to right child
        while(current != null)                  // until no more left children,
        {
            successorParent = successor;
            successor = current;
            current = current.leftChild;        // go to left child
        }
        // if successor not right child, make connections
        if(successor != delNode.rightChild)
        {
            successorParent.leftChild = successor.rightChild;
            successor.rightChild = delNode.rightChild;
        }
        return successor;
    }

    public void traverseType(int traverseType)
    {
        switch(traverseType)
        {
            case 1: System.out.print("\nPreorder traversal: ");
                preOrder(root);
                break;
            case 2: System.out.print("\nInorder traversal: ");
                inOrder(root);
                break;
            case 3: System.out.print("\nPostorder traversal: ");
                postOrder(root);
                break;
        }
        System.out.println(" ");
    }

    private void preOrder(Node localRoot)
    {
        if(localRoot != null)
        {
            System.out.print(localRoot.iData + " ");
            preOrder(localRoot.leftChild);
            preOrder(localRoot.rightChild);
        }
    }
    private void inOrder(Node localRoot)
    {
        if(localRoot != null)
        {
            inOrder(localRoot.leftChild);
            System.out.print(localRoot.iData + " ");
            inOrder(localRoot.rightChild);
        }
    }
    private void postOrder(Node localRoot)
    {
        if(localRoot != null)
        {
            postOrder(localRoot.leftChild);
            postOrder(localRoot.rightChild);
            System.out.print(localRoot.iData + " ");
        }
    }

    public void displayTree()
    {
        Stack globalStack = new Stack();
        globalStack.push(root);
        int nBlanks = 32;
        boolean isRowEmpty = false;
        System.out.println(".........................................................");

        while(isRowEmpty == false)
        {
            Stack localStack = new Stack();
            isRowEmpty = true;

            for(int j = 0; j < nBlanks; j++)
                System.out.print(' ');

            while(globalStack.isEmpty() == false)
            {
                Node temp = (Node)globalStack.pop();
                if(temp != null)
                {
                    System.out.print(temp.iData);
                    localStack.push(temp.leftChild);
                    localStack.push(temp.rightChild);

                    if(temp.leftChild != null || temp.rightChild != null)
                        isRowEmpty = false;
                }
                else
                {
                    System.out.print("- -");
                    localStack.push(null);
                    localStack.push(null);
                }
                for(int j = 0; j < nBlanks *2-2; j++)
                    System.out.print(' ');
            } // end while globalStack not empty
            System.out.println();
            nBlanks /= 2;
            while(localStack.isEmpty () == false)
                globalStack.push( localStack.pop() );
        } // end while isRowEmpty is false
        System.out.println(".........................................................");
    } // end displayTree()
} // end class Tree












