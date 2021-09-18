/*Write a program to obtain a number N and increment its value by 1 if the number
is divisible by 4 otherwise decrement its value by 1*/

import java.util.Scanner;

public class increment_decremment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%4==0)
            System.out.println(++n);
        else
            System.out.println(--n);
    }
}
