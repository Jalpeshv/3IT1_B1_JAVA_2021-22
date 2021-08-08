import java.util.*;
public class ReverseNumber {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i[] = new int[n];
        int a,m;
        for(int j=0;j<n;j++)
        {
            i[j] = sc.nextInt();
        }
        for(int k=0;k<n;k++)
        {
            m = i[k];
            for (int j = 0; m != 0; j++)
            {
                a = m % 10;
                m = m / 10;
                System.out.print(a);
            }
            System.out.print("\n");
        }
    }
}
