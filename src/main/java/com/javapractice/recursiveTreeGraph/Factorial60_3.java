package com.javapractice.recursiveTreeGraph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Factorial60_3 {
    /*
    * 자연수 N이 입력되면 N!를 구하는 프로그램을 작성하세요.
    * 예를 들어 5! = 5*4*3*2*1= 120 입니다.
    * input : 5
    * output : 120
    * */
    public static void main(String[] args) throws IOException {
        Factorial60_3 T = new Factorial60_3();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        System.out.println(T.solution(n));
    }

    public int solution(int n) {
        if (n == 1) return 1;

        return n*solution(n-1);
    }
}
