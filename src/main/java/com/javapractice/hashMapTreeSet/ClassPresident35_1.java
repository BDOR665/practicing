package com.javapractice.hashMapTreeSet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class ClassPresident35_1 {
    public static void main(String[] args) throws IOException {
        ClassPresident35_1 T = new ClassPresident35_1();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();

        HashMap<Character, Integer> hashMap = new HashMap<>();

        for (char x : str.toCharArray()) {
            hashMap.put(x,hashMap.getOrDefault(x,0)+1);
        }

        System.out.println(T.solution(n,hashMap));

    }

    public char solution(int n, HashMap<Character,Integer> hashMap) {
        char answer = ' ';
        int max = 0;

        for (char key : hashMap.keySet()) {
            if (hashMap.get(key) > max) {
                max = hashMap.get(key);
                answer = key;
            }

        }

        return answer;

    }
}
