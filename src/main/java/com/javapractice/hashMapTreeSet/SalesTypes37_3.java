package com.javapractice.hashMapTreeSet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class SalesTypes37_3 {
    public static void main(String[] args) throws IOException {
        SalesTypes37_3 T = new SalesTypes37_3();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] arrN = new int[n];
        for (int i = 0; i<n; i++) {
            arrN[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(T.solution(n,k,arrN));
    }

    public String solution(int n, int k, int[] arrN){
        StringBuilder answer = new StringBuilder();

        // k-1 개를 넣어서 미리 준비
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for (int i = 0; i<k-1; i++) {
            hashMap.put(arrN[i],hashMap.getOrDefault(arrN[i],0)+1);
        }

        int lt=0;
        // k 개 만큼 넣고 사이즈 측정 후 왼쪽 줄이고 오른쪽 추가
        for (int rt=k-1; rt<n; rt++) {
            hashMap.put(arrN[rt],hashMap.getOrDefault(arrN[rt],0)+1);
            answer.append(hashMap.size()).append(" ");

            hashMap.put(arrN[lt],hashMap.get(arrN[lt])-1);
            if (hashMap.get(arrN[lt])==0) {
                hashMap.remove(arrN[lt]);
            }
            lt++;
        }

        answer.setLength(answer.length()-1);

        return answer.toString();
    }
}
