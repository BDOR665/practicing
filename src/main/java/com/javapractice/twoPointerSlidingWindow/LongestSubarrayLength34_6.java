package com.javapractice.twoPointerSlidingWindow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class LongestSubarrayLength34_6 {
    public static void main(String[] args) throws IOException {
        LongestSubarrayLength34_6 T = new LongestSubarrayLength34_6();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(T.solution(n,k,arr));

    }

    public int solution(int n, int k, int[] arr) {
        int answer = 0, count = 0, lt = 0;

        for (int rt = 0; rt<n; rt++) {
            if (arr[rt] == 0) count++;

            while (count > k) {
                if (arr[lt] == 0) count--;
                lt++;
            }

            answer = Math.max(answer, rt-lt+1);
        }

        return answer;
    }
}
