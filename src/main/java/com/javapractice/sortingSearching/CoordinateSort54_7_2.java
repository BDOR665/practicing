package com.javapractice.sortingSearching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

class Point implements Comparable<Point> {
    public int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point o) {
        if (this.x == o.x) return this.y - o.y;
        else return this.x - o.x;
    }
}
public class CoordinateSort54_7_2 {
    public static void main(String[] args) throws IOException {
        CoordinateSort54_7_2 T = new CoordinateSort54_7_2();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        ArrayList<Point> arrN = new ArrayList<>();
        for (int i = 0; i<n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            arrN.add(new Point(x,y));
        }

        System.out.println(T.solution(n, arrN));

    }
    public StringBuilder solution(int n, ArrayList<Point> arrN) {
        StringBuilder answer = new StringBuilder();

        Collections.sort(arrN);

        for (int i = 0; i<n; i++) {
            answer.append(arrN.get(i).x).append(" ").append(arrN.get(i).y).append("\n");
        }

        return answer;
    }
}
