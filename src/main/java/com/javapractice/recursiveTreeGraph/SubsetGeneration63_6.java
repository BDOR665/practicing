package com.javapractice.recursiveTreeGraph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SubsetGeneration63_6 {
    /*
    * 자연수 N이 주어지면 1부터 N까지의 원소를 갖는 집합의 부분집합을 모두 출력하는 프로그램을 작성하세요
    * 공집합은 출력하지 않습니다.
    * input : 3
    * output : 1 2 3
    *          1 2
    *          1 3
    *          1
    *          2 3
    *          2
    *          3
    * */
    public static void main(String[] args) throws IOException {
        SubsetGeneration63_6 T = new SubsetGeneration63_6();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        check = new int[n+1];
        T.DFS(1);

    }
    static int n;
    static int[] check;
    public void DFS(int L) {
        if(L==n+1) {
            StringBuilder tmp = new StringBuilder();
            for (int i = 1; i<=n; i++) {
                if (check[i] == 1) tmp.append(i).append(" ");
            }
            if (!tmp.isEmpty()) System.out.println(tmp);

        }else {
            // 왼쪽
            check[L]=1;
            DFS(L+1);

            // 오른쪽
            check[L]=0;
            DFS(L+1);
        }

    }
}
