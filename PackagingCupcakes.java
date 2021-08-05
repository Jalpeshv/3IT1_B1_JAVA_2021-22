import java.util.*;
public class PackagingCupcakes {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            int a=sc.nextInt();
            int r=a/2+1;
            System.out.println(r);
        }
    }
}
