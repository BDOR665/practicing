package com.javapractice.dfsbfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PermutationWithRepetition76_04 {
    static int n, m;
    static int[] pm;

    public static void main(String[] args) throws IOException {
        PermutationWithRepetition76_04 T = new PermutationWithRepetition76_04();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        pm = new int[m];
        T.DFS(0);
    }

    public void DFS(int L) {
        if (L == m) {
            for (int x : pm) {
                System.out.print(x + " ");
            }
            System.out.println();
        } else {
            for (int i=1; i<=n; i++) {
                pm[L] = i;
                DFS(L+1);
            }
        }
    }
}
