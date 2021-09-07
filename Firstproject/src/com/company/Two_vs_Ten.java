package com.company;

import java.util.Scanner;

public class Two_vs_Ten {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int count=0;
        for(int i=0; i<N; i++)
        {
            int a=sc.nextInt();
            if(a%2==0 && a%5==0)
            {
                System.out.println("0");
            }
            else if(a%5==0 && a%2!=0)
            {
                System.out.println("1");
            }
            else
            {
                System.out.println("-1");
            }
        }
    }
}
