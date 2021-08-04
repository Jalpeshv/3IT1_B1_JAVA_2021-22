import java.util.*;
public class CC_Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int a[] = new int[t];
        for(int i=0;i<t;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<t;i++)
        {
            int sum=0,remainder=0;
            while(a[i]!=0)
            {
                remainder=a[i]%10;
                sum=sum*10 + remainder;
                a[i]/=10;
            }
            System.out.println(sum);
        }
    }
}
