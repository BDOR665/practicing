package com.javapractice.stackQueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class ValidParentheses40_1 {
    public static void main(String[] args) throws IOException {
        ValidParentheses40_1 T = new ValidParentheses40_1();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        System.out.println(T.solution(str));
    }

    public String solution(String str) {

        String answer = "NO";
        Stack<Character> stack = new Stack<>();
        for (char x : str.toCharArray()) {
            if (x == '(') {
                stack.push(x);
            } else {
                if (stack.empty()) return answer;
                stack.pop();
            }

        }
        if (stack.empty()) {
            return "YES";
        }

        return answer;
    }
}
