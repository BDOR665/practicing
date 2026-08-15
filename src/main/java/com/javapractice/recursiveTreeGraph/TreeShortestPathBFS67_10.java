package com.javapractice.recursiveTreeGraph;

import java.util.LinkedList;
import java.util.Queue;

public class TreeShortestPathBFS67_10 {
    /*
     * 넓이 우선 탐색(BFS) : 최단 거리 탐색
     * 이진트리에서 루트 노드부터 말단 노드까지의 가장 짧은 경로를 구한다.
     * 경로의 길이는 이동한 간선(에지)의 개수로 계산한다.
     *
     * 예시 트리에서 가장 가까운 말단 노드는 3번 노드이며,
     * 루트 노드 1에서 3까지의 최단 거리는 1이다.
     *
     * 출력 : 1
     */
    public static void main(String[] args) {
        TreeShortestPathBFS67_10 T = new TreeShortestPathBFS67_10();
        T.root = new Node3(1);
        T.root.lt = new Node3(2);
        T.root.rt = new Node3(3);
        T.root.lt.lt = new Node3(4);
        T.root.lt.rt = new Node3(5);
        System.out.println(T.BFS(T.root));

    }
    Node3 root;
    public int BFS(Node3 root) {
        Queue<Node3> Q = new LinkedList<>();
        Q.offer(root);
        int L = 0;
        while(!Q.isEmpty()) {
            int len = Q.size();
            for(int i = 0; i<len; i++) {
                Node3 cur = Q.poll();
                if(cur.lt == null && cur.rt==null) return L;
                if(cur.lt != null) Q.offer(cur.lt);
                if(cur.rt != null) Q.offer(cur.rt);
            }
            L++;
        }
        return 0;
    }
}
