package com.javapractice.twoPointerSlidingWindow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MaxSales30_3 {
    public static void main(String[] args) throws IOException {
        MaxSales30_3 T = new MaxSales30_3();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i =0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        System.out.print(T.solution(n,k,arr));
    }
    public int solution(int n, int k, int[] arr) {
        int sum = 0;
        for (int i =0; i<k; i++) sum+= arr[i];

        int answer = sum;

        for (int i = k; i<n; i++) {
            sum+= arr[i] - arr[i-k];
            if (sum > answer) answer = sum;
        }

        return answer;
    }
}
