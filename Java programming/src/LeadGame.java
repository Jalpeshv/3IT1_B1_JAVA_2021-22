import java.util.*;
public class LeadGame
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num[][] = new int [n][2];
        int lead[] = new int [n];
        int a[] = new int [n];
        int sum = 0,temp;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<2;j++)
            {
                num[i][j] = sc.nextInt();
            }
            lead[i]=num[i][0]-num[i][1];
            if(lead[i]<0)
            {
                lead[i]=lead[i]*(-1);
                a[i]=2;
            }
            else
            {
                a[i]=1;
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(lead[i]<lead[j])
                {
                    temp=lead[i];
                    lead[i]=lead[j];
                    lead[j]=lead[i];
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.print(a[0]+" "+lead[0]);
    }
}
