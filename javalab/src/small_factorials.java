import java.util.*;
import java.lang.*;
import java.io.*;
    public class small_factorials
    {
        public static void main (String[] args) throws java.lang.Exception
        {

            Scanner sc =new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
            {
                int fact=1;
                int n = sc.nextInt();
                for(int i=1;i<=n;i++)
                {
                    fact= fact*i;
                }
                System.out.println(fact);
            }
        }
    }

