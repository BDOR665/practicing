package com.javapractice.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PeakCount25_10 {
    public static void main(String[] args) throws IOException {
        PeakCount25_10 T = new PeakCount25_10();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[][] arrN = new int[n][n];
        for (int i = 0; i<n; i++) {
            String[] str = br.readLine().split(" ");
            for (int j = 0; j<n; j++) {
                arrN[i][j] = Integer.parseInt(str[j]);
            }
        }

        System.out.print(T.solution(n, arrN));
    }

    public int solution(int n, int[][] arrN) {

        int answer = 0;

        /* 좌표 - 위 아래 왼 오 */
        int[] dx = {-1,1,0,0};
        int[] dy = {0,0,-1,1};


        for (int i = 0; i<n; i++){
            for(int j = 0; j<n; j++) {

                boolean isPeak = true;
                for (int k = 0; k<4; k++) {
                    int nx = i+dx[k];
                    int ny = j+dy[k];

                    if (nx>=0 && nx<n && ny>=0 && ny<n) {
                        if (arrN[i][j] <= arrN[nx][ny]) {
                            isPeak = false;

                        }
                    }

                }

                if (isPeak) {
                    answer++;
                }
            }
        }
        return answer;

    }
}
