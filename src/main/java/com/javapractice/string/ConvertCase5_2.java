package com.javapractice.string;

import java.util.Scanner;

/* 1-2 대소문자 변환 */
public class ConvertCase5_2 {
    public static void main(String[] args) {
        ConvertCase5_2 T = new ConvertCase5_2();
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        System.out.println(T.solution(str));
    }

    public String solution(String str) {
        String answer = "";

        StringBuilder sb = new StringBuilder();

        for(char c : str.toCharArray()){
//            if(Character.isLowerCase(c)){
//                answer += Character.toUpperCase(c);
//            } else {
//                answer += Character.toLowerCase(c);
//            }


//            if(c >= 65 && c <= 90) {
//                answer += (char)(c+32);
//            } else {
//                answer += (char)(c-32);
//            }


            if(Character.isLowerCase(c)){
                sb.append(Character.toUpperCase(c));
            } else {
                sb.append(Character.toLowerCase(c));
            }
        }
        return sb.toString();

//        return answer;
    }
}
