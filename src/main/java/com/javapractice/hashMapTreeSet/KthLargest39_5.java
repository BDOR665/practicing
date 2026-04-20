package com.javapractice.hashMapTreeSet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class KthLargest39_5 {
    public static void main(String[] args) throws IOException {
        KthLargest39_5 T = new KthLargest39_5();
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

    public int solution(int n, int k, int[] arrN) {

        TreeSet<Integer> treeSet = new TreeSet<>(Collections.reverseOrder());
        for (int i = 0; i<n-2; i++) {
            for (int j = i+1; j<n-1; j++) {
                for (int l = j+1; l<n; l++) {
                    int sum = arrN[i] + arrN[j] + arrN[l];
                    treeSet.add(sum);
                }
            }
        }

        int count = 0;
        for (int x : treeSet) {
            count++;
            if (count==k) return x;
        }

        return -1;
    }
}
