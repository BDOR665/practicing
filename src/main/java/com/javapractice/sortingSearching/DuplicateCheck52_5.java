package com.javapractice.sortingSearching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class DuplicateCheck52_5 {
    public static void main(String[] args) throws IOException {
        DuplicateCheck52_5 T = new DuplicateCheck52_5();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arrN = new int[n];
        for (int i = 0; i<n; i++) {
            arrN[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(T.solution(n, arrN));
    }
    public char solution (int n, int[] arrN) {
        char answer = 'U';
        Arrays.sort(arrN);
        for (int i = 0; i<n-1; i++) {
            if (arrN[i] == arrN[i+1]) return 'D';
        }
        return answer;
    }
}
