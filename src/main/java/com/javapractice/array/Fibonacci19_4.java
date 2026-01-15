package com.javapractice.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fibonacci19_4 {
    public static void main(String[] args) throws IOException {
        Fibonacci19_4 T = new Fibonacci19_4();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        System.out.println(T.solution(n));

    }
    public String solution(int n) {

        int[] arr = new int[n];
        arr[0] = 1;
        arr[1] = 1;
        for(int i=2; i<n; i++){
            arr[i] = arr[i-1]+arr[i-2];
        }

        StringBuilder sb = new StringBuilder();
        for (int x : arr) {
            sb.append(x).append(" ");
        }

        String answer = sb.toString();

        return answer;
    }
}
