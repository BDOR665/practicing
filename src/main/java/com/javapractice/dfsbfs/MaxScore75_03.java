package com.javapractice.dfsbfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MaxScore75_03 {
    static int answer = Integer.MIN_VALUE, m, n;
    static int[] count;
    static int[] score;


    public void DFS(int L, int total, int countT) {
        if (countT > m) return;
        if (L == n) {
            answer = Math.max(answer, total);
        } else {
            DFS(L+1, total+score[L], countT+count[L]);
            DFS(L+1, total, countT);
        }

    }

    public static void main(String[] args) throws IOException {
        MaxScore75_03 T = new MaxScore75_03();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        score = new int[n];
        count = new int[n];

        for (int i = 0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            score[i] = Integer.parseInt(st.nextToken());
            count[i] = Integer.parseInt(st.nextToken());
        }

        T.DFS(0, 0, 0);
        System.out.println(answer);
    }

}
