package com.javapractice.dfsbfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BinomialCoefficientMemoization79_07 {

    static int[][] nR;

    public static void main(String[] args) throws IOException {
        BinomialCoefficientMemoization79_07 T = new BinomialCoefficientMemoization79_07();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());

        nR = new int[n+1][r+1];

        System.out.println(T.DFS(n, r));
    }

    public int DFS (int n, int r) {
        if (nR[n][r] > 0) return nR[n][r];
        if (n == r || r ==0) return 1;
        else return nR[n][r] = DFS(n-1, r-1) + DFS(n-1, r);

    }
}
