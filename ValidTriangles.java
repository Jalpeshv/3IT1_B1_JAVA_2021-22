
import java.util.*;
public class ValidTriangles {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            if(a+b+c==180)
                System.out.println("YES");
            else
                System.out.println("NO");

        }


    }
}
