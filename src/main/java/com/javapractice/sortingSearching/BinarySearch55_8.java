package com.javapractice.sortingSearching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BinarySearch55_8 {
    public static void main(String[] args) throws IOException {
        BinarySearch55_8 T = new BinarySearch55_8();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] arrN = new int[n];
        for (int i = 0; i<n; i++) {
            arrN[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(T.solution(n,m,arrN));
    }
    public int solution(int n, int m, int[] arrN) {
        int answer = 0;
        Arrays.sort(arrN);
        int lt = 0;
        int rt = n-1;

        while (lt <= rt){
            int mid = (lt+rt)/2;
            if (arrN[mid] < m){
                lt = mid+1;
            } else if (arrN[mid] == m) {
                answer = mid+1;
                break;
            } else {
                rt = mid-1;
            }
        }
        return answer;
    }
}
