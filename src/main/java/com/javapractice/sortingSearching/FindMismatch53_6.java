package com.javapractice.sortingSearching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class FindMismatch53_6 {
    public static void main(String[] args) throws IOException {
        FindMismatch53_6 T = new FindMismatch53_6();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arrN = new int[n];
        for (int i = 0; i<n; i++) {
            arrN[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println(T.solution(n, arrN));
    }
    public StringBuilder solution (int n, int[] arrN) {
        StringBuilder answer = new StringBuilder();
        // 깊은 복사 vs 얕은 복사
        int[] tmp = arrN.clone();
        Arrays.sort(tmp);
        for (int i = 0; i<n; i++) {
            if(arrN[i] != tmp[i]) {
                answer.append(i+1).append(" ");
            }
        }
        return answer;
    }
}
