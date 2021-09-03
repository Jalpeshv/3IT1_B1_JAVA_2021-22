import java.util.Scanner;

public class CC_Mahesana {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int c1=0,c2=0;
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            if(a[i]%2==0)
            {
                c1++;
            }
            else
            {
                c2++;
            }
        }
        if(c1>c2)
        {
            System.out.println("READY FOR BATTLE");
        }
        else if(c2>c1)
        {
            System.out.println("NOT READY");
        }
        else
        {
            System.out.println("NOT READY");
        }
    }
}
