package com.company;

import java.util.Scanner;

public class Decrement_OR_Increment {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int N=sc.nextInt();
        if(N%4==0)
        {
            System.out.println(N+1);
        }
        else
        {
            System.out.println(N-1);
        }
    }
}
