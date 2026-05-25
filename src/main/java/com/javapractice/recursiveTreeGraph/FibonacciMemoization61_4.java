package com.javapractice.recursiveTreeGraph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FibonacciMemoization61_4 {
    /*
    * 피보나치 수열
    * 1) 피보나치 수열을 출력한다. 피보나치 수열이란 앞의 2개의 수를 합하여 다음 숫자가 되는 수열이다.
    * 2) 입력은 피보나치 수열의 총 항의 수 이다. 만약 7이 입력되면 1 1 2 3 5 8 13을 출력하면 된다.
    *
    * input : 10
    * output : 1 1 2 3 5 8 13 21 34 55
    *
    * */
    public static void main(String[] args) throws IOException {
        FibonacciMemoization61_4 T = new FibonacciMemoization61_4();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        System.out.println(T.solution(n));

    }

    int[] fiBo;

    public int fibo(int n) {
        if(fiBo[n] !=0) return fiBo[n];

        if(n==1 || n==2) {
            return fiBo[n] = 1;
        }

        return fiBo[n] = fibo(n-1) + fibo(n-2);
    }

    public StringBuilder solution(int n ) {
        StringBuilder answer = new StringBuilder();

        fiBo = new int[n+1];
        for (int i = 1; i<=n; i++) {
            answer.append(fibo(i)).append(" ");
        }

        return answer;
    }
}
