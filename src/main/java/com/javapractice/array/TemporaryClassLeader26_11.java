package com.javapractice.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TemporaryClassLeader26_11 {
    public static void main(String[] args) throws IOException {
        TemporaryClassLeader26_11 T = new TemporaryClassLeader26_11();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[][] arrN = new int[n][5];
        for (int i = 0; i<n; i++) {
            String[] str = br.readLine().split(" ");
            for (int j = 0; j<5; j++) {
                arrN[i][j] = Integer.parseInt(str[j]);
            }
        }

        System.out.print(T.solution(n, arrN));

    }

    public int solution(int n, int[][] arrN) {
        int answer = 0;
        int max = -1;

        for (int i = 0; i<n; i++) {
            int count = 0;
            for (int j = 0; j<n; j++) {
                if (i==j) continue;

                for (int k =0; k<5; k++){
                    if (arrN[i][k] == arrN[j][k]){
                        count++;
                        break;
                    }
                }
            }
            if (count > max) {
                max = count;
                answer = i;
            }
        }

        return answer + 1;
    }
}
