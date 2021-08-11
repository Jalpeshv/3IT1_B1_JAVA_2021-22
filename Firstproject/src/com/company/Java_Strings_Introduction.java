package com.company;

import java.util.Scanner;

public class Java_Strings_Introduction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        int a=A.length();
        int b=B.length();
        System.out.println((a+b));
        System.out.println(A.compareTo(B)>0?"Yes":"No");
        A = A.substring(0,1).toUpperCase()+A.substring(1).toLowerCase();
        B = B.substring(0,1).toUpperCase()+B.substring(1).toLowerCase();
        System.out.println(A+" "+B);
    }
}
