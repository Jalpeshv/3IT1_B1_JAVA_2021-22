import java.util.*;
import java.io.*;

class JavaLoops2
{
    public static void main(String []argh)
    {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++)
        {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int y;
            int sum=a;
            for(int j=0;j<n;j++)
            {
                y=(int)Math.pow(2,j);
                sum+=y*b;
                System.out.print(sum+" ");
            }
            System.out.print("\n");
        }
        in.close();
    }
}