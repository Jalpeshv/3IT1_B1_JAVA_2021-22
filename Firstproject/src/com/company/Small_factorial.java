package com.company;
import java.util.Scanner;
public class Small_factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num[]= new int[n];
        for(int i=0; i<n; i++)
        {
            num[i]=sc.nextInt();
        }
        for(int i=0; i<n; i++)
        {
            int f=1;
            for (int j=1; j<=num[i]; j++)
            {
                f=f*j;
            }
            System.out.println(f);
        }
    }
}
