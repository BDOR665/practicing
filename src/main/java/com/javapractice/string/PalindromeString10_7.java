package com.javapractice.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PalindromeString10_7 {
    public static void main(String[] args) throws IOException {
        PalindromeString10_7 T = new PalindromeString10_7();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        System.out.print(T.solution(str));

    }

    public String solution(String str) {
        String answer = "YES";

//        str = str.toUpperCase();
//        int len = str.length();
//        for(int i = 0; i<len/2; i++){
//            if(str.charAt(i)!=str.charAt(len-i-1)){
//                return "NO";
//            }
//        }

        String tmp = new StringBuilder(str).reverse().toString();
        if(!str.equalsIgnoreCase(tmp)) answer = "NO";

        return answer;
    }
}
