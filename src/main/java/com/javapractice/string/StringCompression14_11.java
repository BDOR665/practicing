package com.javapractice.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringCompression14_11 {
    public static void main(String[] args) throws IOException {
        StringCompression14_11 T = new StringCompression14_11();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        System.out.print(T.solution(str));
    }

    public String solution(String str) {
        StringBuilder sb = new StringBuilder();

        int count = 1;
        for (int i = 1 ; i<str.length(); i++) {

            if (str.charAt(i) == str.charAt(i-1)) {
                count ++;
            } else {
                sb.append(str.charAt(i-1));
                if (count > 1){
                    sb.append(count);
                }
                count = 1;
            }
        }
        sb.append(str.charAt(str.length()-1));
        if (count > 1) {
            sb.append(count);
        }

        String answer = sb.toString();

        return answer;
    }
}
