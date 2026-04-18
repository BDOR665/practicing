package com.javapractice.hashMapTreeSet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class ValidAnagram36_2 {
    public static void main(String[] args) throws IOException {
        ValidAnagram36_2 T = new ValidAnagram36_2();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine();
        String str2 = br.readLine();

        HashMap<Character, Integer> hashMap = new HashMap<>();

        for (char x : str1.toCharArray()) {
            hashMap.put(x,hashMap.getOrDefault(x,0)+1);
        }

        System.out.println(T.solution(str2,hashMap));

    }

    public String solution(String arr2, HashMap<Character,Integer> hashMap){

        for (char key : arr2.toCharArray()) {
            if (!hashMap.containsKey(key) || hashMap.get(key) == 0) {
                return "NO";
            }
            hashMap.put(key,hashMap.get(key)-1);
        }

        return "YES";
    }
}
