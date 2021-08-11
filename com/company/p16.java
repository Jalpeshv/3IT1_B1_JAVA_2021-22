package com.company;

import java.util.Scanner;

public class p16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            int y=sc.nextInt();
            int z=sc.nextInt();
            if(x+y+z==180){
                arr[i]=1;
            }
            else{
                arr[i]=0;
            }
        }
        for (int i=0;i<n;i++){
            if(arr[i]==1){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
