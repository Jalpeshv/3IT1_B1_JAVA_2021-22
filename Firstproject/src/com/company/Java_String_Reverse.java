package com.company;
import java.util.Scanner;
public class Java_String_Reverse {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        int len=A.length();
        if(len<=50)
        {
            for(int i=0; i<len; i++)
            {
                if(A.charAt(i)!=A.charAt(len-i-1))
                {
                    System.out.println("No");
                    return;
                }
            }
            System.out.println("Yes");
        }

    }
}
