import java.util.Scanner;

public class CC_Total_Expenses {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        float q[]=new float[t];
        float p[]=new float[t];
        for(int i=0;i<t;i++)
        {
            q[i]=sc.nextInt();
            p[i]=sc.nextInt();
        }
        for(int i=0;i<t;i++)
        {
            if(q[i]>1000)
            {
                System.out.println(String.format("%.6f",(q[i]*p[i]*0.9)));
            }
            else
            {
                System.out.println(String.format("%.6f",q[i]*p[i]));
            }
        }
    }
}
