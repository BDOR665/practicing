package com.javapractice.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrintLargerNumber16_1 {
    public static void main(String[] args) throws IOException {
        PrintLargerNumber16_1 T = new PrintLargerNumber16_1();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");

        int [] arrN = new int[n];
        for (int i = 0; i<n; i++) {
            arrN[i] = Integer.parseInt(str[i]);
        }

        System.out.println(T.solution(n, arrN));

    }

    public String solution(int n, int[] arrN) {

        StringBuilder sb = new StringBuilder();
        sb.append(arrN[0]);
        for(int i = 0; i<n-1; i++) {
            if(arrN[i+1] > arrN[i]) {
                sb.append(" ").append(arrN[i+1]);
            }
        }

        String answer = sb.toString();

        return answer;
    }
}
