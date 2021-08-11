import java.util.*;
public class ChefAndRemissness {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            if(a>b)
                System.out.print(a+" ");
            else
                System.out.print(b+" ");
            System.out.println(a+b);

        }
    }

}
