package com.company;
import java.util.Scanner;
public class Reverse_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){

            int a=sc.nextInt();
            int rev=0;
            while(a!=0)
            {
                int r=a%10;
                rev=rev*10+r;
                a=a/10;


            }
            System.out.println(rev);
        }
    }
}
