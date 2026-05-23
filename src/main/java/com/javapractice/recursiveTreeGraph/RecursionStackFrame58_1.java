package com.javapractice.recursiveTreeGraph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RecursionStackFrame58_1 {
    /*
    * 자연수 N이 입력되면 재귀함수를 이용하여 1부터 N까지를 출력하는 프로그램을 작성하세요.
    * input : 3
    * output : 1 2 3
    *
    * */
    public static void main(String[] args) throws IOException {
        RecursionStackFrame58_1 T = new RecursionStackFrame58_1();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        System.out.println(T.solution(n));
    }

    StringBuilder answer = new StringBuilder();

    public StringBuilder solution(int n) {
        if(n == 0) {
            return answer;
        }
        solution(n-1);

        answer.append(n).append(" ");

        return answer;
    }
}
