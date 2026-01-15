package com.javapractice.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReversedPrime21_6 {
    public static void main(String[] args) throws IOException {
        ReversedPrime21_6 T = new ReversedPrime21_6();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");

        int[] arr = new int[n];
        for (int i = 0; i<n; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }

        System.out.print(T.solution(n,arr));

    }

    public String solution(int n, int[] arr) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i<n; i++) {
            int tmp = arr[i];
            int result = 0;
            while(tmp>0) {
                int t = tmp%10;
                result = result*10+t;
                tmp=tmp/10;
            }
            if (isPrime(result)) {
                sb.append(result).append(" ");
            }

        }

        String answer = sb.toString();

        return answer;
    }

    public boolean isPrime(int result) {
        if (result == 1) return false;

        for(int i = 2; i< result; i++) {
            if (result%i==0) return false;
        }
        return true;
    }
}
