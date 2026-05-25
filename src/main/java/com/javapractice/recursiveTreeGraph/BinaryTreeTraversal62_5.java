package com.javapractice.recursiveTreeGraph;

import java.io.IOException;

public class BinaryTreeTraversal62_5 {
    /*
    * 전위순회, 후회순회 연습
    * */
    Node root;
    public void DFS(Node root) {
        if(root==null) return;
        else {
            // 전위순회
            System.out.print(root.data+" ");
            DFS(root.lt);
            // 중위순회
            System.out.print(root.data+" ");
            DFS(root.rt);
            // 후외순회
            System.out.println(root.data+" ");
        }

    }
    public static void main(String[] args) throws IOException {
        BinaryTreeTraversal62_5 T = new BinaryTreeTraversal62_5();
        T.root = new Node(1);
        T.root.lt = new Node(2);
        T.root.rt = new Node(3);
        T.root.lt.lt = new Node(4);
        T.root.lt.rt = new Node(5);
        T.root.rt.lt = new Node(6);
        T.root.rt.rt = new Node(7);
        T.DFS(T.root);
    }
}
class Node {
    int data;
    Node lt, rt;
    public Node(int val) {
        data = val;
        lt = rt = null;
    }
}
