package com.homeworks.ivangolovich.spiskiderevo;

/**
 * Created by home on 10/26/2018.
 */
public class Node {
   int value;
    Node right;
   Node left;

    public Node(int value) {
        this.value = value;
        this.right = this.left = null;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Node node = (Node) o;

        if (value != node.value) return false;
        if (!right.equals(node.right)) return false;
        return left.equals(node.left);

    }

    @Override
    public int hashCode() {
        int result = value;
        result = 31 * result + right.hashCode();
        result = 31 * result + left.hashCode();
        return result;
    }
}
