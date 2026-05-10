package com.javapractice.sortingSearching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class MusicVideoSplit56_9 {
    public int count (int[] arrN, int capacity) {
        // DVD 장 수
        int cnt = 1;
        int sum  = 0;
        for (int x: arrN) {
            if (sum +x > capacity) {
                cnt++;
                sum = x;
            } else {
                sum += x;
            }
        }
        return cnt;

    }
    public static void main(String[] args) throws IOException {
        MusicVideoSplit56_9 T = new MusicVideoSplit56_9();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] arrN = new int[n];
        for (int i =0; i<n; i++) {
            arrN[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(T.solution(m,arrN));
    }
    public int solution(int m, int[] arrN) {
        int answer = 0;
        int lt = Arrays.stream(arrN).max().getAsInt();
        int rt = Arrays.stream(arrN).sum();

        while(lt <= rt) {
            int mid = (lt+rt)/2;
            if (count(arrN, mid) <= m) {
                answer = mid;
                rt = mid-1;
            } else {
                lt = mid +1;
            }
        }
        return answer;
    }
}
