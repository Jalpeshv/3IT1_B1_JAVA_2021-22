package com.company;
import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

public class helpingChef {



        public static void main (String[] args) throws java.lang.Exception
        {
            // your code goes here
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            for(int i=0;i<n;i++)
            {
                int a=sc.nextInt();
                if(a<10)
                    System.out.println("Thanks for helping Chef!");
                else
                    System.out.println(-1);
            }
        }


}
