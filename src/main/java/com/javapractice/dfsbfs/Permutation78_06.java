package com.javapractice.dfsbfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Permutation78_06 {
    static int n, m;
    static int[] nM, pm, check;

    public static void main(String[] args) throws IOException {
        Permutation78_06 T = new Permutation78_06();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        nM = new int[n];
        pm = new int[m];
        check = new int[n];
        for (int i = 0; i<n; i++) {
            nM[i] = Integer.parseInt(st.nextToken());
        }

        T.DFS(0);
    }

    public void DFS(int L) {
        if (L == m) {
            for (int x : pm) {
                System.out.print(x + " ");
            }
            System.out.println();
        } else {
            for (int i =0; i<n; i++) {
                if (check[i]==0) {
                    check[i] = 1;
                    pm[L] = nM[i];
                    DFS(L+1);
                    check[i] =0;
                }
            }
        }
    }
}
