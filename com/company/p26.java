package com.company;

import java.util.Scanner;

public class p26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int withdrawalAmount = sc.nextInt();
        float totalAmount =  sc.nextFloat();
        float bankCharge = new Float(0.5);
        if((withdrawalAmount+bankCharge)>totalAmount || withdrawalAmount%5 !=0){
            System.out.println(totalAmount);
        }
        else{
            System.out.println(totalAmount - (withdrawalAmount+bankCharge));
        }
    }
}
