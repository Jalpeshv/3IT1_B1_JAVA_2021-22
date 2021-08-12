import java.util.*;
public class PackagingCupcake
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c[] = new int[n];
        int temp1;
        for(int i=0;i<n;i++)
        {
            c[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++)
        {
            temp1 = c[i]/2+1;
            System.out.println(temp1);
        }
    }
}