import java.util.*;
public class ChefAndOperators
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num[][] = new int[n][2];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<2;j++)
            {
                num[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<n;i++)
        {
            if(num[i][0]<num[i][1])
            {
                System.out.println("<");
            }
            else if(num[i][0]>num[i][1])
            {
                System.out.println(">");
            }
            else
            {
                System.out.println("=");
            }
        }
    }
}