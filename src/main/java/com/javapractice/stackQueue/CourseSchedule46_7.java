package com.javapractice.stackQueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class CourseSchedule46_7 {
    public static void main(String[] args) throws IOException {
        CourseSchedule46_7 T = new CourseSchedule46_7();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String subject = br.readLine();
        String hunSu = br.readLine();

        System.out.println(T.solution(subject, hunSu));
    }

    public String solution(String subject, String hunSu) {
        String answer = "YES";

        Queue<Character> queue = new LinkedList<>();
        for (char x : subject.toCharArray()) {
            queue.offer(x);
        }
        for (char x : hunSu.toCharArray()) {
            if (queue.contains(x)) {
                if (queue.poll() != x)  {
                    answer = "NO";
                }
            }
        }
        if (!queue.isEmpty()) {
            answer= "NO";
        }

        return answer;
    }
}
