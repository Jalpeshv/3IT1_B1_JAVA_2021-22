package com.company;

import java.util.Scanner;

public class p31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int t = sc.nextInt();
            while(t-->0)
            {
                int num = sc.nextInt();
                int fact = 1;
                for(int i=1;i<=num;i++)
                {
                    fact = fact*i;
                }
                System.out.println(fact);

            }
        }catch (Exception e){
            return;
        }
    }
}
