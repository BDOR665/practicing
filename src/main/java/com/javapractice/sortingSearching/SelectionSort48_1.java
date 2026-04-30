package com.javapractice.sortingSearching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SelectionSort48_1 {
    public static void main(String[] args) throws IOException {
        SelectionSort48_1 T = new SelectionSort48_1();
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
        StringBuilder st = new StringBuilder();

        for (int i = 0; i<n-1; i++) {
            int minIndex = i;

            for (int j = i+1; j<n; j++){
                if (arr[minIndex]>arr[j]) {
                    minIndex = j;
                }
            }

            int tmp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = tmp;
        }
        for (int i = 0; i<n; i++) {
            st.append(arr[i]);
            if (i != n-1) st.append(" ");
        }
        return st;


    }
}
