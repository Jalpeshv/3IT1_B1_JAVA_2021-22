import java.util.Scanner;

public class CC_Puppy_and_Sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int d[]=new int[t];
        int n[]=new int[t];
        int sum[]=new int[t];
        for(int i=0;i<t;i++)
        {
            d[i]=sc.nextInt();
            n[i]=sc.nextInt();
        }
        for(int i=0;i<t;i++)
        {
            for(int j=1;j<=d[i];j++)
            {
                sum[i]=0;
                for(int k=1;k<=n[i];k++)
                {
                    sum[i]+=k;
                }
                n[i]=sum[i];
            }
        }
        for(int i=0;i<t;i++)
        {
            System.out.println(sum[i]);
        }
    }
}
