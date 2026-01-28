package com.javapractice.twoPointerSlidingWindow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MergeeTwoArrays28_1 {
    public static void main(String[] args) throws IOException {
        MergeeTwoArrays28_1 T = new MergeeTwoArrays28_1();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] tmp = br.readLine().split(" ");
        int[] first = new int[n];
        for (int i =0;i<n; i++) {
            first[i] = Integer.parseInt(tmp[i]);
        }
        int m = Integer.parseInt(br.readLine());
        int [] end = new int[m];
        tmp = br.readLine().split(" ");
        for (int i =0;i<m; i++) {
            end[i] = Integer.parseInt(tmp[i]);
        }

        System.out.print(T.solution(n,first,m,end));

    }
    public String solution(int n, int[] first, int m, int[] end) {
        int[] firstEnd = new int[n+m];
        int p1 =0, p2 =0,i=0;

        while(p1<n && p2 <m) {
            if (first[p1] <= end[p2]) {
                firstEnd[i++] = first[p1++];
            } else {
                firstEnd[i++] = end[p2++];
            }
        }
        while (p1<n) {
            firstEnd[i++] = first[p1++];
        }
        while (p2<m) {
            firstEnd[i++] = end[p2++];
        }

        StringBuilder sb = new StringBuilder();
        for (int x : firstEnd) {
            sb.append(x).append(" ");
        }
        return sb.toString();
    }
}
