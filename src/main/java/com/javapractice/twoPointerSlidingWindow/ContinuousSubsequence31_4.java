package com.javapractice.twoPointerSlidingWindow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ContinuousSubsequence31_4 {
    public static void main(String[] args) throws IOException {
        ContinuousSubsequence31_4 T = new ContinuousSubsequence31_4();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arrN = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i<n; i++) {
            arrN[i] = Integer.parseInt(st.nextToken());
        }

        System.out.print(T.solution(n,m,arrN));

    }

    public int solution(int n, int m, int[] arrN){
        int answer = 0, sum = 0, lt=0;
        for (int rt = 0; rt<n; rt++){
            sum += arrN[rt];

            if (sum == m) answer ++;

            while (sum >= m) {
                sum -= arrN[lt];
                lt++;
                if (sum == m) answer ++;
            }
        }
        return answer;
    }
}
