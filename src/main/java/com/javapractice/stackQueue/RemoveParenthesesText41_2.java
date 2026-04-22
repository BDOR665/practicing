package com.javapractice.stackQueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class RemoveParenthesesText41_2 {
    public static void main(String[] args) throws IOException {
            RemoveParenthesesText41_2 T = new RemoveParenthesesText41_2();
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String str = br.readLine();

            System.out.println(T.solution(str));
    }

    public String solution(String str) {
        Stack<Character> stack = new Stack<>();
        for (char x : str.toCharArray()){
            stack.push(x);
            if (x == ')') {
                while (stack.peek() != '('){
                    stack.pop();
                }
                stack.pop();
            }
        }

        StringBuilder answer = new StringBuilder();
        for (char c : stack){
            answer.append(c);
        }

        return answer.toString();

    }
}
