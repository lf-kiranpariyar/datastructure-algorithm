package com.algorithm.example.tree.search;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author Kiran Pariyar <kiranpariyar@lftechnology.com>
 */
public class DepthFirstSearch {
    private Stack<Node> stack = new Stack<>();
    private List<Integer> result = new ArrayList<>();

    public void dfs(Node node){
        if (node == null) return;
        stack.add(node);
        while (!stack.isEmpty()){
            Node element = stack.pop();
            result.add(element.getData());
            if(element.getLeft() != null) dfs(element.getLeft());
            if(element.getRight() != null) dfs(element.getRight());
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
        System.out.println("Result :" + depthFirstSearch.result);
    }
}
