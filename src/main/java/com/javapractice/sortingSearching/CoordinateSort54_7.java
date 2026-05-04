package com.javapractice.sortingSearching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class CoordinateSort54_7 {
    public static void main(String[] args) throws IOException {
        CoordinateSort54_7 T = new CoordinateSort54_7();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[][] arrN = new int[n][2];
        for (int i = 0; i<n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arrN[i][0] = Integer.parseInt(st.nextToken());
            arrN[i][1] = Integer.parseInt(st.nextToken());
        }

        System.out.println(T.solution(n, arrN));

    }
    public StringBuilder solution(int n, int[][] arrN) {
        StringBuilder answer = new StringBuilder();

        Arrays.sort(arrN, (a,b) -> {if (a[0] == b[0]) return a[1]-b[1]; return a[0]-b[0];});

        for (int i = 0; i<n; i++) {
            answer.append(arrN[i][0]).append(" ").append(arrN[i][1]).append("\n");
        }

        return answer;
    }
}
