package com.javapractice.string;

import java.util.Scanner;

/* 1-1 문자 찾기 */
public class FindCharacter4_1 {
    public static void main(String[] args) {
        FindCharacter4_1 T = new FindCharacter4_1();
        Scanner sc = new Scanner(System.in);

        String str = sc.next(); // 문자열(단어) 하나 받기(String 형태)
        char t = sc.next().charAt(0);

        System.out.println(T.solution(str, t));

    }

    public int solution(String str, char t) {
        int answer = 0;

        str = str.toUpperCase();
        t = Character.toUpperCase(t);

//        for(int i = 0; i < str.length(); i++) {
//            if(str.charAt(i) == t) {
//                answer++;
//            }
//        }

        for(char c : str.toCharArray()) {
            if(c == t) {
                answer++;
            }
        }

        return answer;
    }
}
