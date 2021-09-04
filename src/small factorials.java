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
		int t=sc.nextInt();
		for(int k=0;k<t;k++){
		    int[] a=new int[200];
		    int rem,i=0,n,m=0,flag;
		    n=sc.nextInt();
		    flag=n;
		    while(flag!=0){
		        rem=flag%10;
		        a[i]=rem;
		        flag=flag/10;
		        i++;
		        m++;
		        
		    }
		    int temp,x=0,index=0;
		    for (i=2;i<n;i++ ){
		        temp=0;
		        for(index=0;index<m;index++){
		            x=a[index]*i+temp;
		            a[index]=x%10;
		            temp=x/10;
		        }
		        while(temp!=0){
		            a[index]=temp%10;
		            temp=temp/10;
		            index++;
		            m++;
		        }
		    } 
		    for(i=m-1;i>=0;i--){
		        System.out.print(a[i]);
		    }
		    System.out.print("\n");
		}
		
	}
}
