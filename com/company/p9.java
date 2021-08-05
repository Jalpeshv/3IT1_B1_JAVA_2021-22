package com.company;

import java.util.Scanner;

public class p9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++) {
            int a=sc.nextInt();
            int result=a/2+1;
            System.out.println(result);
        }
    }
}
