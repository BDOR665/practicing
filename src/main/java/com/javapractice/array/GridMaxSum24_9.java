package com.javapractice.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GridMaxSum24_9 {
    public static void main(String[] args) throws IOException {
        GridMaxSum24_9 T = new GridMaxSum24_9();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[][] arrN = new int[n][n];
        for (int i = 0; i<n; i++) {
            String[] str = br.readLine().split(" ");
            for (int j =0; j<n; j++) {
                arrN[i][j] = Integer.parseInt(str[j]);
            }
        }

        System.out.println(T.solution(n, arrN));
    }

    public int solution(int n, int[][] arrN) {
//        int answer = 0;
//        /* 행 합 */
//        for (int i = 0; i<n; i++) {
//            int sum = 0;
//            for (int j = 0; j<n; j++) {
//                sum += arrN[i][j];
//            }
//            answer = Math.max(sum,answer);
//        }
//        /* 열 합 */
//        for (int i = 0; i<n; i++) {
//            int sum = 0;
//            for (int j = 0; j<n; j++) {
//                sum += arrN[j][i];
//            }
//            answer = Math.max(sum,answer);
//        }
//        /* 왼쪽 대각선 합 */
//        int sum1 = 0;
//        for (int i = 0; i<n; i++) {
//                sum1 += arrN[i][i];
//        }
//        answer = Math.max(sum1,answer);
//
//        /* 오른쪽 대각선 합 */
//        int sum2 = 0;
//        for (int i = 0; i<n; i++) {
//            sum2 += arrN[i][n-1-i];
//        }
//        answer = Math.max(sum2,answer);

        int answer = 0;
        int diag1 = 0, diag2 = 0;

        for (int i = 0; i<n; i++) {
            int row = 0;
            int col = 0;
            for (int j = 0; j<n; j++) {
                row += arrN[i][j];
                col += arrN[j][i];
            }
            answer = Math.max(answer,row);
            answer = Math.max(answer,col);

            diag1 += arrN[i][i];
            diag2 += arrN[i][n-1-i];

        }
        answer = Math.max(answer, diag1);
        answer = Math.max(answer, diag2);

        return answer;
    }
}
