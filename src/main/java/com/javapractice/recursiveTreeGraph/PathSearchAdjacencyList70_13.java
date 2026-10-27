package com.javapractice.recursiveTreeGraph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class PathSearchAdjacencyList70_13 {
    /*
    *  정점의 개수가 너무 많아질 경우 메모리의 크기를 줄이는 방법 -> 인접리스트 사용
    * 5 9
    * 1 2
    * 1 3
    * 1 4
    * 2 1
    * 2 3
    * 2 5
    * 3 4
    * 4 2
    * 4 5
    *
    * 6
    * */

    static int n,m, answer = 0;
    static ArrayList<ArrayList<Integer>> graph;
    static int[] ch;
    public void DFS(int v) {
        if (v==n) answer++;
        else {
            for (int nextV : graph.get(v)) {
                if (ch[nextV] == 0){
                    ch[nextV] = 1;
                    DFS(nextV);
                    ch[nextV] =0;
                }
            }
        }

    }

    public static void main(String[] args) throws IOException {
        PathSearchAdjacencyList70_13 T= new PathSearchAdjacencyList70_13();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        graph = new ArrayList<ArrayList<Integer>>();
        for (int i=0; i<=n; i++) {
            graph.add(new ArrayList<Integer>());
        }
        ch = new int[n+1];
        for (int i =0; i<m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph.get(a).add(b);
        }
        ch[1]=1;
        T.DFS(1);
        System.out.println(answer);
    }
}
