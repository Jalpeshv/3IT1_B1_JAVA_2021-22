package com.company;
import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

public class PackagingCupcakes {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();//number of testcase
        for(int i=0;i<t;i++)
        {
            int num=sc.nextInt();//number of cupcakes
            int l=((num/2)+1);
            System.out.println(l);
        }
    }
}
