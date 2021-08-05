package com.company;
import java.math.BigInteger;
import java.util.Scanner;

public class p7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,test,c=1;
        test = sc.nextInt();
        while(test>=c){
            n = sc.nextInt();
            BigInteger factorial = BigInteger.ONE;
            for (int i=1; i<=n; i++){
                factorial = factorial.multiply(BigInteger.valueOf(i));
            }
            System.out.println(factorial);
            c=c+1;
        }
    }
}
