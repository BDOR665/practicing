package com.javapractice.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MentoringPairs27_12 {
    public static void main(String[] args) throws IOException {
        MentoringPairs27_12 T = new MentoringPairs27_12();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = br.readLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int m = Integer.parseInt(str[1]);

        int[][] arrN = new int[m][n];
        for (int i = 0; i<m; i++) {
            str = br.readLine().split(" ");
            for (int j = 0; j<n; j++) {
                arrN[i][j] = Integer.parseInt(str[j]);
            }
        }

        System.out.print(T.solution(n,m,arrN));
    }

    public int solution(int n , int m, int[][] arrN) {
        int answer = 0;

        // pos[시험][학생번호] = 등수(0부터)
        int[][] pos = new int[m][n+1];
        for (int i = 0; i<m; i++) {
            for (int j = 0; j<n; j++) {
                int student = arrN[i][j];
                pos[i][student] = j;
            }
        }

        // (멘토, 멘티) 쌍
        for (int k = 1; k <=n; k++) {
            for (int s = 1; s<=n; s++) {
                if (k==s) continue;

                boolean ok = true;
                for (int t = 0; t<m; t++) {
                    if (pos[t][k]>pos[t][s]){
                        ok = false;
                        break;
                    }
                }
                if (ok) answer++;

            }
        }

//        for (int i = 1; i<=n; i++){
//            for (int j = 1; j<=n; j++) {
//                int count = 0;
//                for (int k = 0; k<m; k++) {
//                    int pi = 0, pj = 0;
//                    for (int s=0; s<n; s++) {
//                        if (arrN[k][s] == i) pi = s;
//                        if (arrN[k][s] == j) pj = s;
//                    }
//                    if (pi<pj) count++;
//                }
//                if (count ==m) {
//                    answer++;
//                }
//            }
//        }


        return answer;
    }
}
