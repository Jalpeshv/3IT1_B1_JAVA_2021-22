/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc= new Scanner(System.in);
		int q= sc.nextInt();
		String s=new String();
		int n,a,b;
		int[] count =new int[2];
		for(int i=0;i<q;i++){
		    n= sc.nextInt();
		    a= sc.nextInt();
		    b= sc.nextInt();
		    s=sc.next();
		    for(int j=0;j<s.length();j++)
		    if(s.charAt(j)=='0')
		    count[0]++;
		    else
		    count[1]++;
		    System.out.println(count[0]*a+count[1]*b);
		    count[0]=0;
		    count[1]=0;
		}
	}
}
