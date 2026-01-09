package com.javapractice.string;

import java.util.ArrayList;
import java.util.Scanner;

public class ReverseWord7_4 {
    public static void main(String[] args) {
        ReverseWord7_4 T = new ReverseWord7_4();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] str = new String[n];

        for (int i=0; i<n; i++) {
            str[i] = sc.next();
        }

        for(String x : T.solution(str)){
            System.out.println(x);
        }

    }

    public ArrayList<String> solution(String[] str) {
        ArrayList<String> answer = new ArrayList<>();

        for(String x : str) {
            String tmp = new StringBuilder(x).reverse().toString();
            answer.add(tmp);
//            char[] s = x.toCharArray(); // 문자 배열
//            int lt = 0, rt = x.length()-1;
//            while (lt<rt) {
//                char tmp = s[lt];
//                s[lt] = s[rt];
//                s[rt] = tmp;
//                lt++;
//                rt--;\7

//            }
//            String tmp = String.valueOf(s);
//            answer.add(tmp);

        }


        return answer;
    }
}
