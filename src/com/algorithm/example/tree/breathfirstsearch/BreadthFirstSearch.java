package com.algorithm.example.tree.breathfirstsearch;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Kiran Pariyar <kiranpariyar@lftechnology.com>
 */
public class BreadthFirstSearch {
    private Queue<Node> queue = new LinkedList<>();

    public void bfs(Node node){
        queue.add(node);
        node.setVisited(true);
        while (!queue.isEmpty()){
            Node element = queue.remove();
            System.out.println(element.getData());
            Node left = element.getLeft();
            Node right = element.getRight();
            if(left != null && !left.isVisited()){
                queue.add(left);
                left.setVisited(true);
            }
            if(right != null && !right.isVisited()){
                queue.add(right);
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
        BreadthFirstSearch breadthFirstSearch = new BreadthFirstSearch();
        breadthFirstSearch.bfs(node);
    }
}
