package com.javapractice.stackQueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// 공주 구하기 - 요세푸스 문제
public class JosephusProblem45_6 {
    public static void main(String[] args) throws IOException {
        JosephusProblem45_6 T = new JosephusProblem45_6();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        System.out.println(T.solution(n,k));
    }

    public int solution(int n, int k) {
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i<=n; i++) {
            queue.offer(i);
        }

        while (queue.size() > 1) {
            for (int i = 1; i<k; i++) {
                queue.offer(queue.poll());
            }
            queue.poll();
        }

        int answer = queue.peek();

        return answer;
    }
}
