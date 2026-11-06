package com.javapractice.dfsbfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DogLoading74_02 {
    static int answer = Integer.MAX_VALUE, c, n;
    static int[] cC;

    public void DFS(int L, int total) {
        if (total > c) return;
        if (L == n) {
            answer = Math.max(answer, total);
        } else {
            DFS(L+1, total+cC[L]);
            DFS(L+1, total);
        }

    }

    public static void main(String[] args) throws IOException {
        DogLoading74_02 T = new DogLoading74_02();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        c = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());

        cC = new int[n];
        for (int i =0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            cC[i] = Integer.parseInt(st.nextToken());
        }

        T.DFS(0, 0);
        System.out.println(answer);
    }
}
