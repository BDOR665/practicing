package com.javapractice.twoPointerSlidingWindow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsecutiveNumberSum32_5 {
    public static void main(String[] args) throws IOException {
        ConsecutiveNumberSum32_5 T = new ConsecutiveNumberSum32_5();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        System.out.print(T.solution(n));
    }

    public int solution(int n) {
        int answer = 0, count = 1;

        n--;
        while (n>0){
            count++;
            n-=count;

            if (n%count == 0) answer++;
        }

        return answer;
    }
}
