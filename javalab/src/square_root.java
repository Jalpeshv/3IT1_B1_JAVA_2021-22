        import java.util.*;
        import java.lang.*;
        import java.io.*;
        public class square_root
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        float t=sc.nextInt();
        for(float i=0;i<t;i++)
        {
            float n = sc.nextInt();
            float res=(float)Math.sqrt(n);
            System.out.println(res);
        }
    }
}
