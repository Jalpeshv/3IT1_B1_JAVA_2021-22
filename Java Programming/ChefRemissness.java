import java.util.*;
public class ChefRemissness
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int g1[] = new int[n];
        int g2[] = new int[n];
        int min[] =new int[n];
        int max[] =new int[n];
        for (int i = 0; i < n; i++)
        {
            g1[i] = sc.nextInt();
            g2[i] = sc.nextInt();
            if(g1[i]>g2[i])
            {
                min[i] = g1[i];
            }
            else
            {
                min[i] = g2[i];
            }
            max[i] = g1[i]+g2[i];
        }
        for (int i = 0; i < n; i++)
        {
            System.out.println(min[i]+" "+max[i]);
        }
    }
}