package com.javapractice;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num1, num2;

        Scanner sc = new Scanner(System.in);
        System.out.println("첫 번째 숫자를 입력해주세요 : ");
        num1 = sc.nextInt();

        System.out.println("두 번째 숫자를 입력해주세요 : ");
        num2 = sc.nextInt();

        System.out.println("입력받은 두 숫자 중에 더 큰 숫자는 : " + Math.max(num1,num2) + "입니다.");
    }
}
