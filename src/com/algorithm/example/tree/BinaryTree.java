package com.algorithm.example.tree;

/**
 * @author Kiran Pariyar <kiranpariyar@lftechnology.com>
 */
public class BinaryTree{
    private int data;
    private BinaryTree left;
    private BinaryTree right;

    public BinaryTree(int data){
        this.data = data;
    }

    /**
     *As a convention, if the key to be inserted is less than the key of root node, then key is inserted in
     *left sub-tree; If key is greater, it is inserted in right sub-tree. If it is equal, as a convention, it
     *is inserted in right sub-tree
     **/
    public void addNode(int num){
        if(num < this.data){
            if(this.left != null){
                this.left.addNode(num);
            }else {
                this.left = new BinaryTree(num);
            }
        }else {
            if(this.right != null){
                this.right.addNode(num);
            }else {
                this.right = new BinaryTree(num);
            }
        }
    }

    // Visit the node first, then left and right sub-trees
    public void traversePreOrder() {
        System.out.println(this.data);
        if( this.left != null ) {
            this.left.traversePreOrder();
        }
        if( this.right != null ) {
            this.right.traversePreOrder();
        }
    }

    // Visit the left sub-trees, then node and right sub-trees
    public void traverseInOrder() {
        if( this.left != null ) {
            this.left.traverseInOrder();
        }
        System.out.println(this.data);
        if( this.right != null ) {
            this.right.traverseInOrder();
        }
    }

    // Visit the left sub-trees, then right sub-trees and node
    public void traversePostOrder() {
        if( this.left != null ) {
            this.left.traversePostOrder();
        }
        if( this.right != null ) {
            this.right.traversePostOrder();
        }
        System.out.println(this.data);
    }

    public static void main(String[] args){
        int[] numbers = {15, 200, 25, -5, 0, 100, 20, 12, 126, 1000, -150};
        BinaryTree binaryTree= new BinaryTree(20);
        for(int num : numbers){
            binaryTree.addNode(num);
        }
        binaryTree.traversePreOrder();
        binaryTree.traverseInOrder();
        binaryTree.traversePostOrder();

        /*
        Pre order traversal
        20, 15, -5, -150, 0, 12, 200, 25, 20, 100, 126, 1000
        Inorder traversal
        -150, -5, 0, 12, 15, 20, 20, 25, 100, 126, 200, 1000
        Post order traversal
        -150, 12, 0, -5, 15, 20, 126, 100, 25, 1000, 200, 20
        */
    }
}
