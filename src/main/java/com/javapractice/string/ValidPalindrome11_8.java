package com.javapractice.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ValidPalindrome11_8 {
    public static void main(String[] args) throws IOException {
        ValidPalindrome11_8 T = new ValidPalindrome11_8();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        System.out.println(T.solution(str));

    }

    public String solution(String str) {
        String answer = "NO";

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < str.length(); i++){
            if (Character.isAlphabetic(str.charAt(i))) {
                sb.append(str.charAt(i));
            }
        }

        String line = sb.toString();
        String reverse = new StringBuilder(line).reverse().toString();

        if(line.equalsIgnoreCase(reverse)) answer = "YES";

//        str = str.toUpperCase().replaceAll("[^A-Z]","");
//        String tmp = new StringBuilder(str).reverse().toString();
//        if(str.equals(tmp)) answer="YES";

        return answer;
    }
}
