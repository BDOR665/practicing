package com.javapractice.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RankCalculator23_8 {
    public static void main(String[] args) throws IOException {
        RankCalculator23_8 T = new RankCalculator23_8();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");
        int[] arrN = new int[n];
        for (int i = 0; i<n; i++) {
            arrN[i] = Integer.parseInt(str[i]);
        }

        System.out.println(T.solution(n,arrN));
    }
    public String solution(int n, int[] arrN) {
        int[] scores = new int[n];
        for (int i = 0; i<n; i++) {
            int score = 1;
            for (int j = 0; j<n; j++) {
                if (arrN[i] < arrN[j]) {
                    score+=1;
                }
            }
            scores[i] = score;
        }

        StringBuilder sb = new StringBuilder();
        for (int i =0; i<n; i++) {
            sb.append(scores[i]).append(" ");
        }

        String answer = sb.toString();
        return answer;

    }
}
