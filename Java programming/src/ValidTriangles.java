import java.util.*;
public class ValidTriangles
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d1[] = new int[n];
        int d2[] = new int[n];
        int d3[] = new int[n];
        int a[] = new int[n];
        for (int i = 0; i < n; i++)
        {
         d1[i]=sc.nextInt();
         d2[i]=sc.nextInt();
         d3[i]=sc.nextInt();
         a[i]=d1[i]+d2[i]+d3[i];
         if(a[i]==180)
         {
             a[i]=1;
         }
         else
         {
             a[i]=0;
         }
        }
        for (int i = 0; i < n; i++)
        {
         if(a[i]==0)
         {
             System.out.println("NO");
         }
         else
         {
             System.out.println("YES");
         }
        }
    }
}
