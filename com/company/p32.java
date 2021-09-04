package com.company;

import java.util.Scanner;

public class p32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            t--;
            int n = sc.nextInt();
            int count=0,m;
            while(n>0){
                m=n%10;
                if(m==4){
                    count++;
                }
                n=n/10;
            }
            System.out.println(count);
        }
    }
}
