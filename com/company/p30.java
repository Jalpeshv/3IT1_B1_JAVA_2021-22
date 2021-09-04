package com.company;

import java.util.Scanner;

public class p30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        for (int i=0;i<a;i++){
            int n = scanner.nextInt();
            int y=n%10;
            while (n>9){
                n=n/10;
            }
            int sum=n+y;
            System.out.println(sum);
        }
    }
}
