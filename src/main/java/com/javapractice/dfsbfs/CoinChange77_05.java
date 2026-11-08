package com.javapractice.dfsbfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class CoinChange77_05 {
    static int answer = Integer.MAX_VALUE, n, m;
    static int[] nCoins;

    public static void main(String[] args) throws IOException {
        CoinChange77_05 T = new CoinChange77_05();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        nCoins = new int[n];
        for (int i = 0; i<n; i++) {
            nCoins[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        m = Integer.parseInt(st.nextToken());

        Arrays.sort(nCoins);

        T.DFS(0, 0);
        System.out.println(answer);
    }

    public void DFS(int L, int sum) {
        if(sum > m) return; // 목표 금액 초과
        if (L >= answer) return; // 이미 찾은 최소 개수보다 줄일 수 없음
        if(sum == m) {
            answer = Math.min(answer, L);
        } else {
            for (int i = n-1; i>=0; i--) {
                DFS(L+1, sum + nCoins[i]);
            }
        }
    }
}
