package com.javapractice.dfsbfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Combination81_09 {

    static int[] combi;
    static int n, m;

    public static void main(String[] args) throws IOException {
        Combination81_09 T = new Combination81_09();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        combi = new int[m];

        T.DFS(0, 1);
    }

    public void DFS(int L, int l) {
        if(L == m) {
            for (int x : combi) {
                System.out.print(x + " ");
            }
            System.out.println();
        } else {
            for (int i = l; i<=n; i++) {
                combi[L] = i;
                DFS(L+1, i+1);
            }
        }
    }
}
