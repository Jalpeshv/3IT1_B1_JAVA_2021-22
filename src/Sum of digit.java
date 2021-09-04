/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int sum;
        int a[]=new int[n];
        for(int i=0;i<n;i++) {

            a[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++) {

            sum = 0;
            while (a[i] > 0) {
                sum = sum + a[i] % 10;
                a[i] = a[i] / 10;
            }
            System.out.println(sum);
        }
	}
}
