import java.util.Scanner;

public class CC_Lucky_Four {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int a[]=new int[t];
        for(int i=0;i<t;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<t;i++)
        {
            int count=0,n;
            while(a[i]!=0)
            {
                n=a[i]%10;
                a[i]/=10;
                if(n==4)
                {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
