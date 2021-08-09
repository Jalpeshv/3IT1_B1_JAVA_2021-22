import java.util.*;
        import java.lang.*;
        import java.io.*;
public class packaging_cupcake
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t,n;
        t=sc.nextInt();
        while(t!=0)
        {
            n=sc.nextInt();
            if(n==1 || n==2)
            {
                System.out.println(n);
            }
            else
            {
                System.out.println(n/2+1);
            }

            t--;
        }
    }
}
