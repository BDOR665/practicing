package com.javapractice.sortingSearching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class LRUCache51_4 {
    public static void main(String[] args) throws IOException {
        LRUCache51_4 T = new LRUCache51_4();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int s = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(T.solution(s, n, arr));
    }

    public StringBuilder solution(int s, int n, int[] arr) {
        StringBuilder answer = new StringBuilder();

        int[] cache = new int[s];
        for (int i = 0; i<n; i++) {
            int pos = -1;

            // 1. cache 안에 현재 작업 arr[i]가 있는지 찾기
            for (int j = 0; j<s; j++) {
                if (cache[j] == arr[i]) {
                    pos = j;
                    break;
                }
            }

            // 2. cache 안에 값이 없으면 하나씩 뒤로 밀기 있으면 그 위치를 기준으로 뒤로 밀기
            if (pos == -1) {
                for (int j = s-1; j>=1; j--) {
                    cache[j] = cache[j-1];
                }
            } else {
                for (int j = pos; j>=1; j--) {
                    cache[j] = cache[j-1];
                }
            }

            cache[0] = arr[i];
        }

        for (int i = 0; i<s; i++) {
            answer.append(cache[i]);
            if (i != s-1) answer.append(" ");
        }

        return answer;

    }
}
