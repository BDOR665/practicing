package com.javapractice.recursiveTreeGraph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BinaryPrint59_2 {
    /*
    * 10진수 N이 입력되면 2진수로 변환하여 출력하는 프로그램을 작성하세요.
    * 단, 재귀함수를 이용해서 출력해야합니다.
    * input : 11
    * output : 1011
    *
    * */
    public static void main(String[] args) throws IOException {
        BinaryPrint59_2 T = new BinaryPrint59_2();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        System.out.println(T.solution(n));
    }

    StringBuilder answer = new StringBuilder();

    public StringBuilder solution(int n) {
        if (n == 0) {
            return answer;
        }
        solution(n/2);
        answer.append(n%2);
        return answer;
    }
}
