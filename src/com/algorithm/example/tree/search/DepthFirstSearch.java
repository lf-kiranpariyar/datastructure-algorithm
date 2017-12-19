package com.algorithm.example.tree.search;

import java.util.Stack;

/**
 * @author Kiran Pariyar <kiranpariyar@lftechnology.com>
 */
public class DepthFirstSearch {
    private Stack<Node> stack = new Stack<>();

    public void dfs(Node node){
        stack.add(node);
        node.setVisited(true);
        while (!stack.isEmpty()){
            Node element = stack.pop();
            System.out.println(element.getData());
            Node left = element.getLeft();
            Node right = element.getRight();
            if(left != null && !left.isVisited()){
                stack.add(left);
                left.setVisited(true);
            }
            if(right != null && !right.isVisited()){
                stack.add(right);
                right.setVisited(true);
            }
        }
    }

    public static void main(String[] args){
        int[] numbers = {15, 200, 25, -5, 0, 100, 20, 12, 126, 1000, -150};
        Node node= new Node(20);
        for(int num : numbers){
            node.addNode(num);
        }
        DepthFirstSearch depthFirstSearch = new DepthFirstSearch();
        depthFirstSearch.dfs(node);
    }
}
