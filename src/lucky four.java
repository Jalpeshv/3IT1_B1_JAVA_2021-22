/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int q=sc.nextInt();
		int count;
		for(int i=0;i<q;i++){
		    int n= sc.nextInt();
		    count=0;
		    while(n!=0){
		        if(n%10==4){count++;}
		        n/=10;
		    }
		    System.out.println(count);
		}
	}
}
