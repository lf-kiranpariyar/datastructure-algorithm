package com.algorithm.example.tree.search;

/**
 * @author Kiran Pariyar <kiranpariyar@lftechnology.com>
 */
public class Node {
    private int data;
    private Node left;
    private Node right;

    public Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public int getData() {
        return data;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }

    public void addNode(int num){
        if(num < this.data){
            if(this.left != null){
                this.left.addNode(num);
            }else {
                this.left = new Node(num);
            }
        }else {
            if(this.right != null){
                this.right.addNode(num);
            }else {
                this.right = new Node(num);
            }
        }
    }
}
