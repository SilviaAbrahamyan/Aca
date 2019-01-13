package com.homeworks.ivangolovich.spiskiderevo;

/**
 * Created by home on 10/26/2018.
 */
public class BinaryTree {
    Node root;

    public void add(Node node) {

        if (this.root.value > node.value) {
            this.root.left = node;
        } else {
            this.root.right = node;
        }
    }

    int size() {
        return size(root);
    }

    /* computes number of nodes in tree */
    int size(Node node) {
        if (node == null)
            return 0;
        else
            return (size(node.left) + 1 + size(node.right));
    }

    int height(Node node) {
        if (node == null) {
            return 0;
        } else {
            int l = height(node.left);
            int r = height(node.right);
            if (l < r) {
                return (r + 1);
            } else {
                return (l + 1);
            }
        }
    }

    int max(Node node) {
        if (node == null) {
            return 0;
        } else {

            int val = node.value;
            int l = max(node.left);
            int r = max(node.right);

            if( val< r){
                val = r;
            }
            if(val< l){
                val = l;
            }
            return val;
        }
    }

    public static void main(String args[])
    {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(2);
        tree.root.left = new Node(7);
        tree.root.right = new Node(5);
        tree.root.left.right = new Node(6);
        tree.root.left.right.left = new Node(1);
        tree.root.left.right.right = new Node(11);
        tree.root.right.right = new Node(9);
        tree.root.right.right.left = new Node(4);

        System.out.println("Maximum element is " +
                tree.max(tree.root));
    }
}
