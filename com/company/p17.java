package com.company;

import java.util.Scanner;

public class p17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            if(a>b)
                System.out.print(a+" ");
            else
                System.out.print(b+" ");
            System.out.println(a+b);
        }
    }
}
