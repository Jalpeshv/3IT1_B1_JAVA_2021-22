[8:49 PM, 9/3/2021] Mataji: import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	 Scanner sc=new Scanner(System.in);
	  int a=sc.nextInt();
	  for(int i=0;i<a;i++)
	  {
	      float b=sc.nextInt();
	      float HRA =0;
	      float DA=0;
	     // float GS =0;
	      if(b<1500)
	      {
	          HRA = (10*b)/100;
	          DA = (90*b)/100;
	      }
	      else
	      {
	      if(b>=1500)
	       {
	          HRA = 500;
	          DA = (98*b)/100;
	      }
	      
	      }
	      System.out.println(b+HRA+DA);
	  }
	 // System.out.println(b+HRA+DA);
	}
	
}
[8:49 PM, 9/3/2021] Mataji: gross salary
[8:51 PM, 9/3/2021] Mataji: import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	
		Scanner sc=new Scanner(System.in);
		int t;
		t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
		    int a,b,c;
		    a=sc.nextInt();
		    b=sc.nextInt();
		    c=sc.nextInt();
		    if(a+b+c == 180)
		    {
		      System.out.println("YES");
		    }
		    else
		    {
		      System.out.println("NO");  
		    }
		}
	}
}
