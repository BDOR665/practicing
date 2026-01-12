package com.javapractice.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CharacterDistance13_10 {
    public static void main(String[] args) throws IOException {
        CharacterDistance13_10 T = new CharacterDistance13_10();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] parts = br.readLine().split(" ");
        String str = parts[0];
        char c = parts[1].charAt(0);

        int[] result = T.solution(str, c);
        for (int x : result) {
            System.out.print(x + " ");
        }
    }

    public int[] solution(String str, char c) {
        int[] answer = new int[str.length()];
        int p = 1000;
        for (int i = 0; i<str.length(); i++) {
            if(str.charAt(i) == c) {
                p = 0;
                answer[i] = 0;
            } else {
                p++;
                answer[i] = p;
            }

        }
        p = 1000;
        for (int i = str.length()-1; i>=0; i--) {
            if (str.charAt(i) == c) {
                p=0;
            } else {
                p++;
                answer[i] = Math.min(answer[i],p);
            }
        }

        return answer;
    }
}
