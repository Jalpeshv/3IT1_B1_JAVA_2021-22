import java.util.*;
import java.lang.*;
import java.io.*;
public class ValidTriangles {
    public static void main (String[] args) throws java.lang.Exception
    {

        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int i;
        float a[]=new float[t];
        float b[]=new float[t];
        float c[]=new float[t];
        for(i=0;i<t;i++)
        {
            a[i]=sc.nextFloat();
            b[i]=sc.nextFloat();
            c[i]=sc.nextFloat();
        }
        for(i=0;i<t;i++)
        {
            float s=a[i]+b[i]+c[i];
            if(s==180)
            {
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        {
            return;
        }
    }
}
