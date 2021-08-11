package com.company;

import java.util.Scanner;

public class Chef_and_Remissness {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        for(int i=0; i<N; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a > b) {
                System.out.println(a + " " +(a + b));
            } else {
                System.out.println(b + " " + (a + b));
            }
        }
    }
}
