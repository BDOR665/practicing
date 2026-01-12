package com.javapractice.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PasswordDecoder15_12 {
    public static void main(String[] args) throws IOException {
        PasswordDecoder15_12 T = new PasswordDecoder15_12();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();

        System.out.print(T.solution(n, str));

    }

    public String solution(int n, String str) {
        String answer = "";
        for (int i = 0; i<n; i++) {
            String part = str.substring(0,7).replace('#','1').replace('*','0');
            int num = Integer.parseInt(part,2);
            answer += (char)num;
            str = str.substring(7);
        }

        return answer;
    }
}
