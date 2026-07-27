package com.javapractice.recursiveTreeGraph;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeLevelSearch64_7 {
    /*
    * 넓이 우선 탐색 : 레벨탐색
    * 이진트리로 레벨탐색 연습
    *
    * 레벨 탐색 순회 출력 : 1 2 3 4 5 6 7
    * */
    public static void main(String[] args) {
        BinaryTreeLevelSearch64_7 T = new BinaryTreeLevelSearch64_7();
        T.root = new Node2(1);
        T.root.lt = new Node2(2);
        T.root.rt = new Node2(3);
        T.root.lt.lt = new Node2(4);
        T.root.lt.rt = new Node2(5);
        T.root.rt.lt = new Node2(6);
        T.root.rt.rt = new Node2(7);
        T.BFS(T.root);
    }
    Node2 root;
    public void BFS(Node2 root) {
        Queue<Node2> Q = new LinkedList<>();
        Q.offer(root);
        int L=0;
        while(!Q.isEmpty()){
            int len = Q.size();
            System.out.print(L+" : ");
            for(int i =0;i<len; i++){
                Node2 cur = Q.poll();
                System.out.print(cur.data+" ");
                if(cur.lt!=null) Q.offer(cur.lt);
                if (cur.rt!=null) Q.offer(cur.rt);
            }
            L++;
            System.out.println();
        }
    }
}
class Node2 {
    int data;
    Node2 lt, rt;
    public Node2(int val) {
        data = val;
        lt = rt = null;
    }
}
