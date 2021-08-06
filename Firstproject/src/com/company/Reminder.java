package com.company;
import java.util.Scanner;
public class Reminder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int a,b;
        for(int i=0;i<n;i++){
            a=sc.nextInt();
            b=sc.nextInt();
            int rem=a%b;
            System.out.println(rem);
        }

    }
}
