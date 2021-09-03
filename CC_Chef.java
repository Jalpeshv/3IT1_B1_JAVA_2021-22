import java.util.*;
public class CC_Chef {
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
            if(a[i]<10)
            {
                System.out.println("Thanks for helping Chef!");
            }
            else
            {
                System.out.println("-1");
            }
        }
    }
}
