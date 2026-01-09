package com.javapractice.string;

import java.util.Scanner;

public class RemoveDuplicateChar9_6 {
    public static void main(String[] args) {
        RemoveDuplicateChar9_6 T = new RemoveDuplicateChar9_6();
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        System.out.println(T.solution(str));
    }

    public String solution(String str) {
        String answer = "";

        for(int i = 0; i<str.length(); i++) {

//            System.out.println(str.charAt(i)+" "+i+" "+str.indexOf(str.charAt(i)));
            if (str.indexOf(str.charAt(i))==i){
                answer += str.charAt(i);
            }

        }

        return answer;
    }
}
