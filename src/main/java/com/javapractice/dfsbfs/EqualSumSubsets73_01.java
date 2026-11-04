package com.javapractice.dfsbfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class EqualSumSubsets73_01 {
    static int n, total = 0;
    static int[] nN;
    static String answer = "NO";
    boolean flag = false;


    public static void main(String[] args) throws IOException {
        EqualSumSubsets73_01 T = new EqualSumSubsets73_01();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        nN = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i =0; i<n; i++) {
            nN[i] = Integer.parseInt(st.nextToken());
            total += nN[i];
        }
        T.DFS(0, 0);
        System.out.println(answer);
    }

    public void DFS(int L, int sum) {
        if (flag) return;
        if (sum > total/2) return;
        if (L == n) {
            if ((total - sum) == sum) {
                answer = "YES";
                flag = true;
            }
        } else {
            DFS(L+1, sum+nN[L]);
            DFS(L+1, sum);
        }
    }
}
