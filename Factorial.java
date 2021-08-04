import java.util.*;
public class Factorial {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=0;i<n;i++)
        {
            int a=sc.nextInt();
            int f=1;
            while(a!=0)
            {
                f=f*a;
                a--;
            }
            System.out.println(f);

        }

    }
}
