import java.util.*;
public class a
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int h[]=new int[n];
        for(int i=0;i<n;i++)
        {
            h[i]=sc.nextInt();
        }
        for(int j=0;j<n;j++)
        {
            System.out.println(h[j]);
        }
    }
}
