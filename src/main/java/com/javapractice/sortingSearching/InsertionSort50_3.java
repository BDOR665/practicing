package com.javapractice.sortingSearching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class InsertionSort50_3 {
    public static void main(String[] args) throws IOException {
        InsertionSort50_3 T = new InsertionSort50_3();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(T.solution(n, arr));
    }

    public StringBuilder solution(int n, int[] arr) {
        StringBuilder answer = new StringBuilder();

        for (int i = 1; i<n; i++) {
            int tmp = arr[i];
            int j = i-1;

            while (j >= 0 && tmp < arr[j]) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = tmp;
        }

        for (int i = 0; i<n; i++) {
            answer.append(arr[i]);
            if (i != n-1) answer.append(" ");
        }

        return answer;
    }
}
