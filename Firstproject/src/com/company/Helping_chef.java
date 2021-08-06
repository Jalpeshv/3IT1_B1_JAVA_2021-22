package com.company;

import java.util.Scanner;

public class Helping_chef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++)
        {
            int num = sc.nextInt();

            if  (num < 10)
                System.out.println("Thanks for helping Chef!");
            else
                System.out.println("-1");
        }


    }
}
