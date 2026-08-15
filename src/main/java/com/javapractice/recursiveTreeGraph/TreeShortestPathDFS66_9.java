package com.javapractice.recursiveTreeGraph;

public class TreeShortestPathDFS66_9 {
    /*
     * 깊이 우선 탐색(DFS) : 최단 거리 탐색
     * 이진트리에서 루트 노드부터 말단 노드까지의 가장 짧은 경로를 구한다.
     * 경로의 길이는 이동한 간선(에지)의 개수로 계산한다.
     *
     * 예시 트리에서 가장 가까운 말단 노드는 3번 노드이며,
     * 루트 노드 1에서 3까지의 최단 거리는 1이다.
     *
     * 출력 : 1
     */
    public static void main(String[] args) {
        TreeShortestPathDFS66_9 T = new TreeShortestPathDFS66_9();
        T.root = new Node3(1);
        T.root.lt = new Node3(2);
        T.root.rt = new Node3(3);
        T.root.lt.lt = new Node3(4);
        T.root.lt.rt = new Node3(5);
        System.out.println(T.DFS(0, T.root));

    }
    Node3 root;
    public int DFS(int L, Node3 root) {
        if (root.lt == null && root.rt == null) return L;
        else return Math.min(DFS(L+1, root.lt), DFS(L+1, root.rt));
    }
}

class Node3 {
    int data;
    Node3 lt, rt;
    public Node3(int val) {
        data = val;
        lt = rt = null;
    }
}
