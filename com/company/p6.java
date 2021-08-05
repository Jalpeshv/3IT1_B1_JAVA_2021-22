package com.company;

import java.util.Scanner;

public class p6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        for(int i=0;i<a;i++)
        {
            int n = sc.nextInt();
            int result=(int)Math.sqrt(n);
            System.out.println(result);
        }
    }
}
