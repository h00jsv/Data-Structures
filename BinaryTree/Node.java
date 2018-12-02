package DataStructuresTextbook.Arrays.Chapter_8_BinaryTrees.treeProgram2;

/**
 * Created by Joakim on 05/05/15.
 */
class Node
{
    public int iData;       // data item (key)
    public double dData;    // data item
    public Node leftChild;  // this node's left child
    public Node rightChild;

    // display ourself
    public void displayNode()
    {
        System.out.print('{');
        System.out.print(iData);
        System.out.print(", ");
        System.out.print(dData);
        System.out.print("} ");
    }

} // end class Node
