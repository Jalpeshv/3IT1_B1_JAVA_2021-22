import java.lang.*;
import java.util.*;
public class SqaureRoot
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num[] = new int[n];
        int temp;
        for(int i=0;i<n;i++)
        {
            num[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            temp = (int)Math.sqrt(num[i]);
            System.out.println(temp);
        }
    }
}
