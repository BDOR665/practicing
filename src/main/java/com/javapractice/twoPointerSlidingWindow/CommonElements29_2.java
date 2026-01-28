package com.javapractice.twoPointerSlidingWindow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class CommonElements29_2 {
    public static void main(String[] args) throws IOException {
        CommonElements29_2 T = new CommonElements29_2();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] tmp = br.readLine().split(" ");
        int[] arrN = new int[n];
        for (int i = 0; i<n; i++) {
            arrN[i] = Integer.parseInt(tmp[i]);
        }
        int m = Integer.parseInt(br.readLine());
        tmp = br.readLine().split(" ");
        int[] arrM = new int[m];
        for (int i = 0; i<m; i++) {
            arrM[i] = Integer.parseInt(tmp[i]);
        }

        System.out.print(T.solution(n,arrN, m,arrM));

    }
    public String solution(int n , int[] arrN, int m, int[] arrM){
        Arrays.sort(arrN);
        Arrays.sort(arrM);

        StringBuilder sb = new StringBuilder();
        int p1 =0, p2 =0;
        while (p1 <n && p2<m){
            if (arrN[p1] == arrM[p2]){
                sb.append(arrN[p1]).append(" ");
                p1++;
                p2++;
            } else if(arrN[p1] < arrM[p2]){
                p1++;
            } else {
                p2++;
            }
        }

        return sb.toString();
    }
}
