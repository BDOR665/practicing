package com.javapractice.stackQueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class CraneDollPickup42_3 {
    public static void main(String[] args) throws IOException {
        CraneDollPickup42_3 T = new CraneDollPickup42_3();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[][] nNBoard = new int[N][N];
        for (int i = 0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j= 0; j<N; j++) {
                nNBoard[i][j] = Integer.parseInt(st.nextToken());

            }
        }

        int M = Integer.parseInt(br.readLine());
        int[] moves = new int[M];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i<M; i++) {
            moves[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(T.solution(N,nNBoard,M,moves));
    }

    public int solution(int N, int[][] nNBoard, int M, int[] moves) {
        int answer = 0;

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i<M; i++) {
            int col = moves[i]-1;
            for (int row = 0; row<N; row++) {
                if (nNBoard[row][col]!=0){
                    int doll = nNBoard[row][col];
                    nNBoard[row][col] = 0;
                    if (!stack.isEmpty() && stack.peek() == doll) {
                        stack.pop();
                        answer+=2;
                    } else {
                        stack.push(doll);
                    }
                    break;
                }
            }
        }

        return answer;
    }
}
