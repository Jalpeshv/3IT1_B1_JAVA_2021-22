package com.company;
import java.util.Scanner;
import java.math.*;
public class Small_factorials {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        if(N>=1 && N<=100){
            for(int i=0; i<N; i++)
            {
                int num=sc.nextInt();
                BigInteger fac = new BigInteger ("1");
                for(int j=1; j<=num; j++){
                    fac = fac.multiply(BigInteger.valueOf(j));
                }
                System.out.println(fac);
            }
        }
    }

}
