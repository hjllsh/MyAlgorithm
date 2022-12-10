package com.study.study04;

import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;

public class HashAndTree {
    //定义节点
    public static class Node {
        public int value;
        public Node next;
        public Node(int value) {
            this.value = value;
        }
    }
//    定义节点比较器
    public static class NodeComparator implements Comparator<Node> {
        @Override
        public int compare(Node o1, Node o2){return o1.value - o2.value;}
    }
    public static void main(String[] args) {
        Node nodeA = null;
        Node nodeB = null;
        Node nodeC = null;

        HashMap<String,Integer> hashMap = new HashMap<>();

    }
}
