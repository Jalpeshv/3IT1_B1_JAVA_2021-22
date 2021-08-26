import java.util.*;
public class TheBlockGame {
    public static void main (String[] args)
    {
        // your code goes here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=0;i<n;i++)
        {
            int a=sc.nextInt();
            int m=a;
            int rem,rev=0;
            while(a>0)
            {
                rem=a%10;
                rev=(rev*10)+rem;
                a=a/10;
            }
            if(m==rev)
                System.out.println("wins");
            else
                System.out.println("loses");

        }
    }
}
