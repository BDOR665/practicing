package com.javapractice.stackQueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Person {
    int index;
    int priority;
    public Person(int index, int priority) {
        this.index = index;
        this.priority = priority;
    }

}

public class EmergencyRoom47_8 {
    public static void main(String[] args) throws IOException {
        EmergencyRoom47_8 T = new EmergencyRoom47_8();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        Queue<Person> queue = new LinkedList<>();
        for (int i = 0; i<n; i++) {
            queue.offer(new Person(i, Integer.parseInt(st.nextToken())));
        }

        System.out.println(T.solution(m,queue));
    }

    public int solution(int m, Queue<Person> queue){
        int answer = 0;

        while (!queue.isEmpty()) {
            Person tmp = queue.poll();
            for (Person x : queue) {
                if (x.priority> tmp.priority) {
                    queue.offer(tmp);
                    tmp = null;
                    break;
                }
            }
            if (tmp != null){
                answer++;
                if (tmp.index == m) {
                    return answer;
                }
            }

        }

        return answer;
    }
}
