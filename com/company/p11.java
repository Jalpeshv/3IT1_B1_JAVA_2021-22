package com.company;

import java.util.Scanner;

public class p11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        String[] s = new String[n];
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            int y=sc.nextInt();
            if(x>y){
                s[i]=">";
            }
            else if(x<y){
                s[i]="<";
            }
            else{
                s[i]="=";
            }
        }
        for (int i=0;i<n;i++){
            System.out.println(s[i]);
        }
    }
}
