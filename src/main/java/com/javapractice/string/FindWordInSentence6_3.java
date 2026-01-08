package com.javapractice.string;

import java.util.Scanner;

/* 문장 속 단어 */
public class FindWordInSentence6_3 {
    public static void main(String[] args) {
        FindWordInSentence6_3 T = new FindWordInSentence6_3();
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine(); // 단어가 아닌 띄어쓰기를 포함한 한 문장을 저장

        System.out.println(T.solution(str));

    }

    public String solution(String str) {
        String answer = "";

        int max = Integer.MIN_VALUE; // 가장 작은 값으로 초기화
        String[] s = str.split(" ");
        for(String x : s) {
            int len = x.length();
            if (len > max){
                max = len;
                answer = x;
            }
        }
//        int max = Integer.MIN_VALUE, pos;
//        while((pos=str.indexOf(' ')) != -1) { // 첫 번째로 발견되는 인덱스 위치
//            String tmp = str.substring(0, pos);
//            int len = tmp.length();
//            if(len > max) {
//                max = len;
//                answer = tmp;
//            }
//            str=str.substring(pos+1);
//        }
//        if(str.length() > max ) {
//            answer = str;
//        }

        return answer;
    }
}
