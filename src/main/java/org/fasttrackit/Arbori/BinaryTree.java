package org.fasttrackit.Arbori;

class Node{

    int nod;
    Node left,right;
    Node(int key)
    {
        nod=key;
        left=null;
        right=null;
    }
}

public class BinaryTree {

    Node root;
    BinaryTree(){
        root=null;
    }

    public static void main(String[] args)
    {
        BinaryTree bt2=new BinaryTree();
        bt2.root=new Node(1);
        bt2.root.left=new Node(2);
        bt2.root.right=new Node(3);
        bt2.root.left.left=new Node(4);
        bt2.root.left.right=new Node(5);
        bt2.root.right.left=new Node(6);
        bt2.root.right.right=new Node(7);
        bt2.root.left.left.left=new Node(8);
        bt2.root.left.left.right=new Node(9);
        bt2.root.left.right.left=new Node(10);
        bt2.root.left.right.right=new Node(11);
        bt2.root.right.left.left=new Node(12);
        bt2.root.right.left.right=new Node(13);
        bt2.root.right.right.left=new Node(14);
        bt2.root.right.right.right=new Node(15);
    }
}

