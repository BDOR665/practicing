package com.javapractice.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExtractNumber12_9 {
    public static void main (String[] args) throws IOException {
        ExtractNumber12_9 T = new ExtractNumber12_9();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        System.out.println(T.solution(str));

    }

    public int solution(String str) {
        StringBuilder num = new StringBuilder();

        for (int i=0; i<str.length(); i++) {
            if(Character.isDigit(str.charAt(i))) {
                num.append(str.charAt(i));
            }
        }

        int answer = Integer.parseInt(num.toString());

//        int answer = 0;
//        for (char x : str.toCharArray()) {
//            if(x>=48 && x<=57) {
//                answer = answer*10 + (x-48);
//            }
//        }

//        String tmp ="";
//        for (char x : str.toCharArray()){
//            if(Character.isDigit(x)) {
//                tmp += x;
//            }
//        }
//        int answer = Integer.parseInt(tmp);


        return answer;
    }
}
