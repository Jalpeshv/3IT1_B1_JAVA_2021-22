import java.util.*;
import java.io.*;

class DataTypes{
    public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            try
            {
                long x=sc.nextLong();
                long a;
                System.out.println(x+" can be fitted in:");
                a=128;
                if(x>=-a && x<=a-1)System.out.println("* byte");
                //Complete the code
                a=a*256;
                if(x>=-a && x<=a-1)System.out.println("* short");
                a=a*65536;
                if(x>=-a && x<=a-1)System.out.println("* int");
                a=a*65536*65536;
                if(x>=-a && x<=a-1)System.out.println("* long");
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }
        }
    }
}