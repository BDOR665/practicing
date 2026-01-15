package com.javapractice.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RockPaperScissors18_3 {
    public static void main(String[] args) throws IOException {
        RockPaperScissors18_3 T = new RockPaperScissors18_3();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[] partsA = br.readLine().split(" ");
        String[] partsB = br.readLine().split(" ");

        int[] arrA = new int[n];
        int[] arrB = new int[n];

        for (int i = 0; i<n; i++) {
            arrA[i] = Integer.parseInt(partsA[i]);
            arrB[i] = Integer.parseInt(partsB[i]);
        }

        char[] result = T.solution(n,arrA,arrB);
        for (char x : result) {
            System.out.println(x);
        }

    }
    public char[] solution(int n, int[] arrA, int[] arrB) {
        char[] answer  = new char[n];


        for (int i = 0; i<n; i++){
            if(arrA[i]== arrB[i]) {
                answer[i] = 'D';
            } else if (arrA[i] - arrB[i] == 2 || arrA[i] - arrB[i] == -1) {
                answer[i] = 'B';
            } else {
                answer[i] = 'A';
            }
        }

        return answer;
    }
}
