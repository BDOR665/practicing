package com.javapractice.sortingSearching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class AggressiveCows57_10 {
    public static void main(String[] args) throws IOException {
        AggressiveCows57_10 T = new AggressiveCows57_10();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] xi = new int[n];
        for (int i = 0; i<n; i++) {
            xi[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(T.solution(n,c,xi));
    }

    public int solution(int n, int c, int[] xi){
        int answer = 0;
        Arrays.sort(xi);
        int lt = 1;
        int rt = xi[n-1];

        while (lt <= rt) {
            int mid = (lt+rt)/2;

            if (count(xi,mid) >= c) {
                answer = mid;
                lt = mid+1;
            } else {
                rt = mid -1;
            }
        }
        return answer;
    }

    public int count(int[] xi, int distance) {
        int count = 1; // 첫 번째 마구간에는 무조건 배치
        int last = xi[0]; // 마지막으로 말 배치한 위치

        for (int i = 1; i<xi.length; i++) {
            if (xi[i] - last >= distance) {
                count++;
                last = xi[i];
            }
        }
        return count;
    }
}
