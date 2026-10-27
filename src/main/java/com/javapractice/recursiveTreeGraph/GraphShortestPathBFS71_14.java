package com.javapractice.recursiveTreeGraph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class GraphShortestPathBFS71_14 {

    /*
    * 그래프 최단거리 문제(BFS)
    * 6 9
    * 1 3
    * 1 4
    * 2 1
    * 2 5
    * 3 4
    * 4 5
    * 4 6
    * 6 2
    * 6 5
    *
    * 2 : 3
    * 3 : 1
    * 4 : 1
    * 5 : 2
    * 6 : 2
    * */

    static int n, m;
    static ArrayList<ArrayList<Integer>> graph;
    static int[] ch, dis;
    public void BFS(int v) {
        Queue<Integer> queue = new LinkedList<>();
        ch[v] = 1;
        dis[v] = 0;
        queue.offer(v);
        while (!queue.isEmpty()) {
            int currentV = queue.poll();
            for (int nextV : graph.get(currentV)) {
                if (ch[nextV] == 0) {
                    ch[nextV]=1;
                    queue.offer(nextV);
                    dis[nextV] = dis[currentV] +1;
                }
            }
        }

    }

    public static void main(String[] args) throws IOException {
        GraphShortestPathBFS71_14 T = new GraphShortestPathBFS71_14();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        graph = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i<=n; i++) {
            graph.add(new ArrayList<Integer>());
        }
        ch = new int[n+1];
        dis = new int[n+1];
        for (int i = 0; i<m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph.get(a).add(b);
        }
        T.BFS(1);
        for (int i=2; i<=n; i++) {
            System.out.println(i+" : "+dis[i]);
        }
    }
}
