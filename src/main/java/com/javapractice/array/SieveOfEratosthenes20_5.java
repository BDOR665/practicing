package com.javapractice.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 에라토스테네스의 체
*  소수가 아닌 걸 지워서 남기는 방식
*  2의 배수 부터 3의 배수, 4의 배수 ... 비교를 하면서 지워 나간다. */
public class SieveOfEratosthenes20_5 {
    public static void main(String[] args) throws IOException {
        SieveOfEratosthenes20_5 T = new SieveOfEratosthenes20_5();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        System.out.println(T.solution(n));
    }
    public int solution(int n) {
        int answer =0;

        int[] arr = new int[n+1];
        for (int i = 2; i<=n; i++){
            if (arr[i] == 0) {
                answer ++;
                for (int j = i; j<=n; j=j+i) {
                    arr[j] = 1;
                }
            }
        }

        return answer;
    }
}
