package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class p21 {
    static boolean isAnagram(String a, String b) {
        // Complete the function
        if(a.length()!=b.length()){
            return false;
        }
        char[] a1=a.toLowerCase().toCharArray();
        char[] b1=b.toLowerCase().toCharArray();

        Arrays.sort(a1);
        Arrays.sort(b1);

        /*String s1 = new String(a1);
        String s2 = new String(b1);*/

        return Arrays.equals(a1,b1);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
