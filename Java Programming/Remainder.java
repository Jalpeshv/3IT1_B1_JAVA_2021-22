import java.util.*;
public class Remainder {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i[] = new int[n];
        int a,m,x=1,y=0;
        for(int j=0;j<n;j++)
        {
            i[j] = sc.nextInt();
        }
        for(int k=0;k<n;k++)
        {
            m = i[k];
            x=1;
            for (int j = 0; m != 0; j++)
            {
                a = m % 10;
                m = m / 10;
                if((j==0 && a==0) ||(y==1 && a==0))
                {
                    y=1;
                }
                else
                {
                    y=0;
                    System.out.print(a);
                }
            }
            System.out.print("\n");
        }
    }
}