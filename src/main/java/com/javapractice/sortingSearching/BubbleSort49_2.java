package com.javapractice.sortingSearching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BubbleSort49_2 {
    public static void main(String[] args) throws IOException {
        BubbleSort49_2 T = new BubbleSort49_2();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(T.solution(n,arr));
    }
    public StringBuilder solution(int n, int[] arr) {
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i<n-1; i++) {
            for (int j = i+1; j<n; j++) {
                if (arr[i] > arr[j]) {
                    int tmp = arr[i];
                    arr [i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }

        for (int i = 0; i<n; i++) {
            answer.append(arr[i]);
            if (i!=n-1) answer.append(" ");
        }

        return answer;
    }
}
