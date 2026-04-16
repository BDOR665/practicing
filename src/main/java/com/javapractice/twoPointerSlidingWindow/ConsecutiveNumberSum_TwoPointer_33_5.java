package com.javapractice.twoPointerSlidingWindow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsecutiveNumberSum_TwoPointer_33_5 {
    public static void main(String[] args) throws IOException {
        ConsecutiveNumberSum_TwoPointer_33_5 T = new ConsecutiveNumberSum_TwoPointer_33_5();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        System.out.print(T.solution(n));
    }

    public int solution(int n) {
        int answer = 0, sum = 0, lt = 1;

        for (int rt = 1; rt <= n/2+1; rt++) {
            sum += rt;

            if (sum == n) answer++;

            while (sum >= n){
                sum -= lt++;
                if (sum == n) answer++;
            }
        }

        return answer;
    }
}
