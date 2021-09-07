package com.company;

import java.util.Scanner;

public class Mahasena {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int N=sc.nextInt();
        int l=0;
        int u=0;
        for(int i=0; i<N; i++)
        {
            int s=sc.nextInt();
            if(s%2==0)
            {
                l++;
            }
            else
            {
                u++;
            }
        }
        if(l>u)
        {
            System.out.println("READY FOR BATTLE");
        }
        else
        {
            System.out.println("NOT READY");
        }

    }
}
