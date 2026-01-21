package com.javapractice.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ScoreCalculator22_7 {
    public static void main(String[] args) throws IOException {
        ScoreCalculator22_7 T = new ScoreCalculator22_7();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");
        int[] arrN = new int[n];
        for (int i = 0; i<n; i++) {
            arrN[i] = Integer.parseInt(str[i]);
        }

        System.out.println(T.solution(n, arrN));
    }
    public int solution(int n, int[] arrN) {
//        int answer = 0;
//        int[] scores = new int[n];
//        for (int i = 0; i<n; i++) {
//            if (arrN[i] == 1){
//                scores[i] +=1;
//                if (i>0 && scores[i-1] != 0) {
//                    scores[i] += scores[i-1];
//                }
//            }
//        }
//        for (int i = 0; i<n; i++) {
//            answer += scores[i];
//        }

        int answer = 0, cnt = 0;
        for (int i = 0; i<n; i++) {
            if (arrN[i] == 1){
                cnt++;
                answer+=cnt;
            } else {
                cnt = 0;
            }
        }
        return answer;
    }
}
