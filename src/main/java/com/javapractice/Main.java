package com.javapractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] nN = new int[m][n];

        for (int i = 0; i<m; i++){
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j<n; j++) {
                nN[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        System.out.print(T.solution(n,m,nN));
    }
    public int solution(int n, int m, int[][] nN) {
        int answer = 0;

        return answer;
    }
}
