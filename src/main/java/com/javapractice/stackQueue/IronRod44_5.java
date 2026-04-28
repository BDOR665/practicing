package com.javapractice.stackQueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class IronRod44_5 {
    public static void main(String[] args) throws IOException {
        IronRod44_5 T = new IronRod44_5();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        System.out.println(T.solution(str));

    }

    public int solution(String str) {
        int answer = 0;

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i<str.length(); i++) {
            char x = str.charAt(i);
            if (x == '(') {
                stack.push(x);
            } else {
                stack.pop();
                if (str.charAt(i-1) == '('){
                    answer += stack.size();
                } else {
                    answer+=1;
                }
            }
        }

        return answer;
    }
}
