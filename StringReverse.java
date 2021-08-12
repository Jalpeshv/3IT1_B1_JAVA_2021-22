package com.company;
import java.util.Scanner;
public class StringReverse {

        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            String str = scan.nextLine();
            String reversed = new StringBuilder(str).reverse().toString();
            System.out.println(str.equals(reversed) ? "Yes" : "No");
        }
    }

