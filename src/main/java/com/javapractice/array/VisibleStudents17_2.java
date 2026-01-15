package com.javapractice.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class VisibleStudents17_2 {
    public static void main(String[] args) throws IOException {
        VisibleStudents17_2 T = new VisibleStudents17_2();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");

        int[] arrN = new int[n];
        for (int i = 0; i< n; i++) {
            arrN[i] = Integer.parseInt(str[i]);
        }

        System.out.println(T.solution(arrN, n));

    }
    public int solution(int[] arrN, int n) {
        int answer = 1;
        int max = arrN[0];
        for (int i = 0; i<n; i++) {
            if(max < arrN[i]) {
                answer++;
                max = arrN[i];
            }
        }

        return answer;
    }
}
