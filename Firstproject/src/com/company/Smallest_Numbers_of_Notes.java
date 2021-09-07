package com.company;

import java.util.Scanner;

public class Smallest_Numbers_of_Notes {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int N=sc.nextInt();
        for(int i=0; i<N; i++)
        {
            int a=sc.nextInt();
            int R[]={1,2,5,10,50,100};
            int sum=0;
            for(int j=5; j>=0; j--)
            {

                sum+=a/R[j];
                a%=R[j];
            }
            System.out.println(sum);
        }
    }
}
