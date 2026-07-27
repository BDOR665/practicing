package com.javapractice.recursiveTreeGraph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class FindCalf65_8 {
    public static void main(String[] args) throws IOException {
        FindCalf65_8 T = new FindCalf65_8();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int s = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());

        System.out.println(T.BFS(s,e));
    }


    public int BFS(int s, int e) {
        if (s == e) return 0;

        int[] dis = {1, -1, 5};
        int[] check = new int[10001]; // 한 번 지나온 곳은 다시 방문하지 않음, 값이 1이면 방문
        Queue<Integer> Q = new LinkedList<>();

        check[s] = 1;
        Q.offer(s);
        int L = 0;


        while (!Q.isEmpty()) {
            int len = Q.size();
            for(int i = 0; i<len; i++) {
                int x=Q.poll();
                for (int j = 0; j <3; j++) {
                    int nx=x+dis[j];
                    if (nx == e) return L+1;
                    if(nx >= 1 && nx <= 10000 && check[nx] ==0) {
                        check[nx] = 1;
                        Q.offer(nx);
                    }
                }
            }
            L++;
        }
        return 0;
    }

}
