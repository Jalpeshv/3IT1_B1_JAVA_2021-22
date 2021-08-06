package com.company;


import java.util.Scanner;

public class Sum_FT_Digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        int N = sc.nextInt();
        String number[] = new String[N];
        for(int i=0; i<N; i++)
        {
            number[i] = sc.next();
        }
        for(int i=0; i<N; i++)
        {
            int sum = (number[i].charAt(0) - '0') + (number[i].charAt(number[i].length()-1) - '0');
            System.out.println(sum);
        }
    }
}
