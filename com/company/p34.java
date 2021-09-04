package com.company;

import java.util.Scanner;

public class p34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a%4 == 0){
            System.out.println(++a);
        }
        else {
            System.out.println(--a);
        }
    }
}
