import java.util.*;
public class Factorial
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num[] = new int[n];
        int fact[] = new int[n];
        int temp=1;
        for(int i=0;i<n;i++)
        {
            num[i] = sc.nextInt();
            fact[i]=temp;
            for(int j=1;j<=num[i];j++)
            {
                fact[i]=fact[i]*j;
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(fact[i]);
        }
    }
}
