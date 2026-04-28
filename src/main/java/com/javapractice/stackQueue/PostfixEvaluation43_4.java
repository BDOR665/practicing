package com.javapractice.stackQueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class PostfixEvaluation43_4 {
    public static void main(String[] args) throws IOException {
        PostfixEvaluation43_4 T = new PostfixEvaluation43_4();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        System.out.println(T.solution(str));

    }

    public int solution(String str) {

        Stack<Integer> stack = new Stack<>();

        for (char x : str.toCharArray()) {
            if (Character.isDigit(x)) {
                stack.push(x-'0');
            } else {
                int rt = stack.pop();
                int lt = stack.pop();

                if (x == '+') {
                    stack.push(lt+rt);
                } else if (x == '-') {
                    stack.push(lt-rt);
                } else if (x == '*') {
                    stack.push(lt*rt);
                } else if (x == '/') {
                    stack.push(lt/rt);
                }
            }
        }

        int answer = stack.pop();

        return answer;
    }
}
