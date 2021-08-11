import java.util.*;
import java.lang.*;
import java.io.*;
public class ChefAndRemissness {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int i;
        int a[]=new int[t];
        int b[]=new int[t];
        for(i=0;i<t;i++)
        {
            a[i]=sc.nextInt();
            b[i]=sc.nextInt();
        }
        for(i=0;i<t;i++)
        {
            int k=a[i];
            int j=b[i];
            if(k>j)
            {
                System.out.println(k+" "+(k+j));
            }
            else{
                System.out.println(j+" "+(k+j));
            }
        }
        {
            return;
        }
    }
}
