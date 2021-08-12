import java.math.BigInteger;
import java.util.*;
public class Factorials
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num[] = new int[n];
        int temp = 1;
        BigInteger fact[] = new BigInteger[n];
        BigInteger m;
        for (int i = 0; i < n; i++)
        {
            num[i] = sc.nextInt();
            fact[i] = BigInteger.valueOf(temp);
            for (int j = 1; j <= num[i]; j++)
            {
                m = BigInteger.valueOf(j);
                fact[i] = fact[i].multiply(m);
            }
        }
        for (int i = 0; i < n; i++)
        {
            System.out.println(fact[i]);
        }
    }
}